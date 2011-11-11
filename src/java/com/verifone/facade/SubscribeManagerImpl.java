/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.facade;

import com.verifone.dao.UserDAOImpl;

/**
 *
 * @author dkannadasan
 */
public class SubscribeManagerImpl implements SubscribeManager{
private UserServiceImpl userService;
@Override
    public String subscribe(String email, String mobileNo) {
        ;
        System.out.println(getUserService());
        //user.verifyEmail(email);
        
        if(email!=null && "devs@encoress.com".equals(email)){
           return "success"; 
        }else if (mobileNo!=null && "9998887777".equals(mobileNo)){
            return "success";
        }
        return "No Matching email Id found";
    }

    @Override
    public String register(String identifier, String reciptId, String type) {
        System.out.println(type);
        System.out.println(identifier);
        System.out.println(reciptId);
        
        if("email".equals(type) && "devs@encoress.com".equals(identifier.trim()) && "1111".equals(reciptId)){
           return "success";
        }
        return "Email and receipt id doesn't match";
    }
    
    public UserServiceImpl getUserService() {
        return userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }
    
    
}
