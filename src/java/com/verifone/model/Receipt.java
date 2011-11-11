/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author dkannadasan
 */
public class Receipt implements Serializable{
    public Receipt(){
        
    }
    
    private Integer gkey;
    private BigInteger userId;
    private String receiptId;
    private Date receiptDate;

    public Integer getGkey() {
        return gkey;
    }

    public void setGkey(Integer gkey) {
        this.gkey = gkey;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }
   
    
    
}
