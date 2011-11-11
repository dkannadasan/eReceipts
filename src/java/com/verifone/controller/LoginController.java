/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.controller;

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
public class LoginController implements Controller {
 private SubscribeManager subscribeManager;
 private UserServiceImpl userService;

    
 
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String receiptId = request.getParameter("receiptId");
        String identifier = request.getParameter("email");
        System.out.println(receiptId);
        System.out.println(identifier);
        String message = this.userService.register(identifier,receiptId, "email");
        System.out.println(message);
       // String message = this.subscribeManager.register(identifier, receiptId, "email");
        if(!"error".equals(message)){
            System.out.println("Message::::"+message);
          return new ModelAndView("authenticate","message",message);  
        }
         Map<String, Object> model = new HashMap<String, Object>();
            model.put("emailId", request.getParameter("email"));
            model.put("mobile", request.getParameter("mobile"));
            model.put("error","Not a valid receipt id. Try with a different receipt id");
        return new ModelAndView("register","model",model);
        
    }
    
    public void setSubscribeManager(SubscribeManager subscribeManager) {
        this.subscribeManager = subscribeManager;
    }
    
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }
}
