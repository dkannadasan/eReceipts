/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.dao;

import com.verifone.model.Receipt;
import com.verifone.model.User;
import java.math.BigInteger;
import org.hibernate.Criteria;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dkannadasan
 */
@Transactional
public class UserDAOImpl {

    /** Creates a new instance of UserDAOImpl */
    public UserDAOImpl() {
    }
    private HibernateTemplate hibernateTemplate;

    public void setSessionFactory(SessionFactory sessionFactory) {

        this.hibernateTemplate = new HibernateTemplate(sessionFactory);

    }

    public void register(User user) {
        try {
            hibernateTemplate.save(user);
        } catch (Exception e) {
            throw new RuntimeException(e.toString());
        }
    }

    public User verifyEmail(String email) {
        System.out.println("VerifyEmail");

        //Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(User.class);
        List<User> list = hibernateTemplate.find("from User where emailId='" + email + "'");
        if (list.size() > 0) {
            return list.get(0);
        }

        return null;

    }

    public boolean isReceiptIdAndEmailMatch(String identifier, String receiptId) {
int intValue = 10;
        List<User> list = hibernateTemplate.find("from User where emailId='" + identifier + "'");
       
        if (list.size() > 0) {
            User user = list.get(0);
            Integer userId = user.getUserId();

            List<Receipt> receipts = hibernateTemplate.find("from Receipt where userId="+intValue);


            for (Receipt receipt : receipts) {
                System.out.println(receipt.getReceiptId());
                System.out.println(receipt.getReceiptDate().toString());
                if (receipt.getReceiptId() != null && receipt.getReceiptId().equals(receiptId)) {
                    System.out.println("In the true loop");
                    user.setRegistered(true);
                    hibernateTemplate.update(user);
                    return true;
                }
            }
       }
        System.out.println("In the false loop");
        return false;
    }
    
    public List<Receipt> getReceiptsByUserId(Integer userId){
        List<Receipt> list = hibernateTemplate.find("from Receipt where userId="+userId);
        for(Receipt receipt : list){
           System.out.println(receipt.getReceiptId()); 
           System.out.println(receipt.getReceiptDate()); 
        }
        return list;
        
    }

    public Integer getUserIdByEmail(String emailId) {
        List<User> list = hibernateTemplate.find("from User where emailId='"+emailId+"'");
        if (list.size() > 0) {
            User user = list.get(0);
            Integer userId = user.getUserId();
            return userId;
        }
        return 0;
        
    }
}
