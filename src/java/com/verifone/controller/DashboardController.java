/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.controller;

import com.verifone.facade.UserServiceImpl;
import com.verifone.model.Receipt;
import java.util.ArrayList;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import java.util.List;
import java.util.Map;


/**
 *
 * @author dkannadasan
 */
public class DashboardController implements Controller{
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getParameter("emailId");
        Map viewValues = new HashMap();
        List<Receipt> receipts = userService.getReceiptsByEmailId("devs@encoress.com");
        for(Receipt receipt : receipts){
            viewValues.put(receipt.getReceiptId(),receipt.getReceiptDate());
            
        }
        return new ModelAndView("dashboard","receipts",viewValues);
    }
    
}
