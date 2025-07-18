package com.ab.springWeb1.controller;

import com.ab.springWeb1.model.Product;
import com.ab.springWeb1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProduct(){
        return service.getProducts();
    }

}
