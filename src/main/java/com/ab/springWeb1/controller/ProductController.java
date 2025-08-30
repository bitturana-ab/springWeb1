package com.ab.springWeb1.controller;

import com.ab.springWeb1.model.Product;
import com.ab.springWeb1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;


//    @RequestMapping and GetMapping are same
    @GetMapping("/products")
    public List<Product> getProduct(){
        return service.getProducts();
    }

//    get product by url
    @GetMapping("/products/{prodId}")
    public  Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }
//    add product and return message
    @PostMapping("/products")
    public String addProduct(@RequestBody Product prod){
        return service.addProduct(prod);
    }

//    update or put data of product
    @PutMapping("/products")
    public String updateProduct(@RequestBody Product prod){
        return service.updateProduct(prod);
    }

//    delete product by their prodId
    @DeleteMapping("/products/{prodId}")
    public String deleteProduct(@PathVariable int prodId){
        return service.deleteProduct(prodId);
    }

}
