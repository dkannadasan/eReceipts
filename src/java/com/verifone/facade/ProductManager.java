/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.facade;

import java.io.Serializable;
import com.verifone.model.Product;
import java.util.List;

/**
 *
 * @author dkannadasan
 */
public interface ProductManager extends Serializable {
    public void increasePrice(int percentage);
    public List<Product> getProducts();
    
}
