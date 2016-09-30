package com.retail.app.services;

import org.springframework.web.bind.annotation.RestController;

import com.retail.app.processor.ProductDetailsManager;
import com.retail.app.to.ErrorResponseTO;
import com.retail.app.to.ProductResponseTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ProductsAPI {
    @Autowired
    ProductDetailsManager productDetailsManager;
    @RequestMapping("/products/{id}")
    public ResponseEntity<?> getProductAndPriceDetails(@PathVariable Integer id) throws Exception {
    	ResponseEntity<?> responseEntity = null;
    	String output = null;
    	System.out.println("productId>>>>"+id);
        //call api.target.com external API through ProductDetailsManager
        //to get product name
        ErrorResponseTO errorResponseTO = new ErrorResponseTO();
        ProductResponseTO productResponseTO = new ProductResponseTO();

        if(id != null){
        	output = productDetailsManager.getProductName(id);
        	if(output.indexOf("error :") != -1){
    	       errorResponseTO.setErrorDesc(output.substring(7, output.length()));
    	       responseEntity = new ResponseEntity<>(errorResponseTO, HttpStatus.OK); 
        	}else{
    	       productResponseTO.setId(id);
    	       productResponseTO.setName(output);
    	       responseEntity = new ResponseEntity<>(productResponseTO, HttpStatus.OK);     	       
        	}        	
        }
        
        // Call pricing information from a NoSQL data store , MongoDB
        
       productDetailsManager.getProductPriceInfo(id);
       return responseEntity;
        
        
    }
    
}
