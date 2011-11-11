/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verifone.facade;

import com.verifone.model.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dkannadasan
 */
public class ProductMangerImpl implements ProductManager{

    private List<Product> products;
    @Override
    public void increasePrice(int percentage) {
        if(products !=null){
            for(Product product :products){
                double newPrice = product.getPrice().doubleValue() * 
                                    (100 + percentage)/100;
                product.setPrice(newPrice);
            }
            
        }
    }

    @Override
    public List<Product> getProducts() {
        products = new ArrayList();
        Product product1 = new Product();
        product1.setDescription("Dell Laptop");
        product1.setPrice(899.99);
        Product product2 = new Product();
        product2.setDescription("Toshiba Laptop");
        product2.setPrice(799.99);
        products.add(product1);
        products.add(product2);
        return products;
    }
    
    public void setProducts(List<Product> products) {
           this.products = products;     
    } 
    
}
