/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.model;

import java.io.Serializable;
import java.math.BigInteger;


/**
 *
 * @author dkannadasan
 */
public class User implements Serializable{
    public User(){
        
    }
    
        private Integer userId;
	private String firstName;
	private String lastName;
	private String company;
	private String comments;
        private String emailId;
        private BigInteger mobile;
        private Boolean registered;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public BigInteger getMobile() {
        return mobile;
    }

    public void setMobile(BigInteger mobile) {
        this.mobile = mobile;
    }

    public Boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }
        

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    
}
