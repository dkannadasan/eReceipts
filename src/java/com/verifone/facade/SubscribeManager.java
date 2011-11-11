/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.facade;

/**
 *
 * @author dkannadasan
 */
public interface SubscribeManager {
    String subscribe(String email, String mobileNo);
    String register(String identifier, String reciptId, String type);
    
}
