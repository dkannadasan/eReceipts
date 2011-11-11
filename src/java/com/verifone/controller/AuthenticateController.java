/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author dkannadasan
 */
public class AuthenticateController implements Controller {
public AuthenticateController() {
    }
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView();
    }    
}
