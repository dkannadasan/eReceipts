/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.controller;

import com.verifone.dao.UserDAOImpl;
import com.verifone.facade.SubscribeManager;
import com.verifone.facade.UserServiceImpl;
import com.verifone.model.User;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author dkannadasan
 */
public class RegisterController implements Controller {

    private SubscribeManager subscribeManager;
    private UserServiceImpl userService;
    private UserDAOImpl userDAO;

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String email = request.getParameter("emailId");
        String mobile = request.getParameter("mobile");
        System.out.println(email);
        System.out.println(mobile);
        
        System.out.println(this.subscribeManager);
        User user = this.userService.verifyEmail(email);
        String message = this.subscribeManager.subscribe(email, mobile);
        System.out.println(message);
        if (user!=null && user.getEmailId().equals(email.trim())) {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("emailId", request.getParameter("emailId"));
            model.put("mobile", request.getParameter("mobile"));
            return new ModelAndView("register", "model", model);
        }

        return new ModelAndView("subscribe","error","Sorry no reference for the Email Id specified found on our system");
    }
    
    public void setSubscribeManager(SubscribeManager subscribeManager) {
        this.subscribeManager = subscribeManager;
    }
    
    public UserServiceImpl getUserService() {
        return userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }
    
    public UserDAOImpl getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }
}
