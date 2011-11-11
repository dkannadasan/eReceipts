/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.controller;

import com.verifone.facade.UserServiceImpl;
import com.verifone.model.UserTO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author dkannadasan
 */

public class AddEditUserController extends SimpleFormController {

    public AddEditUserController() {
    }

    protected Object formBackingObject(HttpServletRequest request) throws ServletException {
        UserTO userTO = new UserTO();
        return userTO;
    }
    
    						
public ModelAndView onSubmit(Object command) throws Exception{
	try {
		UserTO userTO = (UserTO) command;
		userService.register(userTO);
		return new ModelAndView(getSuccessView(),"userTO",userTO);
	} catch (Exception e) {
		return new ModelAndView(getSuccessView(),"error",e.toString());
	}   
 }

 private UserServiceImpl userService;

 public UserServiceImpl getUserService() {
	 return userService;
 }

 public void setUserService(UserServiceImpl userService) {
	 this.userService = userService;
 }


}
