/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.controller;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;
import com.verifone.facade.ProductManager;
import com.verifone.model.Product;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 *
 * @author dkannadasan
 */
public class SubscribeController implements Controller {

    private ProductManager productManager;

    public SubscribeController() {
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("In Subscribe Controller");

        String now = (new Date()).toString();
        Map<String, Object> myModel = new HashMap<String, Object>();
        List<Product> products = this.productManager.getProducts();
        myModel.put("now",now);
        myModel.put("products", products);
        return new ModelAndView("subscribe", "model", myModel);
    }

    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    }
}
