package com.ab.springWeb1.controller;

import com.ab.springWeb1.model.Product;
import com.ab.springWeb1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

//    field injection is Autowired
//    auto connect to ProductService or it,s type and also spring will  auto create class of it
    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProduct(){
        return service.getProducts();
    }

//    get product by url
    @RequestMapping("/products/{prodId}")
    public  Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

}
