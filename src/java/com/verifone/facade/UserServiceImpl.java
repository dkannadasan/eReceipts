/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.facade;

import com.verifone.dao.UserDAOImpl;
import com.verifone.model.Receipt;
import com.verifone.model.User;
import com.verifone.model.UserTO;
import java.math.BigInteger;
import org.springframework.beans.BeanUtils;
import java.util.List;

/**
 *
 * @author dkannadasan
 */
public class UserServiceImpl {

    private UserDAOImpl userDAO;

    public UserServiceImpl() {
    }

    public void register(UserTO userTO) {

        try {
            User user = new User();
            BeanUtils.copyProperties(userTO, user);
            userDAO.register(user);

        } catch (Exception exp) {
            throw new RuntimeException(exp.toString());
        }
    }

    public User verifyEmail(String emailId) {
        User user = userDAO.verifyEmail(emailId);
        return user;
    }
    
    public String register(String identifier, String receiptId, String type) {
        if("email".equals(type)){
           boolean  isMatched = userDAO.isReceiptIdAndEmailMatch(identifier,receiptId);
           System.out.println("isMatched:"+isMatched);
           if(isMatched){
               return "Successfully registered: Your password is 'password'";
           }
        }
        return "error";
    }
    
    public List<Receipt> getReceiptsByEmailId(String emailId){
        Integer userId = userDAO.getUserIdByEmail(emailId);
        List<Receipt> receipts = userDAO.getReceiptsByUserId(userId);
        
        return receipts;
    }

    public UserDAOImpl getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    
}
