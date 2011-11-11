/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.test;

import com.verifone.controller.SubscribeController;
import junit.framework.TestCase;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author dkannadasan
 */
public class SubscribeControllerTests extends TestCase {
     public void testHandleRequestView() throws Exception{ 
         SubscribeController subscribe = new SubscribeController();
         ModelAndView mv = subscribe.handleRequest(null, null);
         assertEquals("subscribe", mv.getViewName());
         
         assertNotNull(mv.getModel());
         String timeNow = mv.getModel().get("now").toString();
         assertNotNull(timeNow);
     }
    
}
