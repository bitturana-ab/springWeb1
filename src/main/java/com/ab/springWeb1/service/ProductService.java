package com.ab.springWeb1.service;

import com.ab.springWeb1.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

//    create dummy data coll, but we should use DB for data
    List<Product> products = Arrays.asList(
            new Product(01,"samsung a54",34000),
            new Product(02,"samsung a55",45000));

    public List<Product> getProducts(){
        return products;
    }


    public Product getProductById(int prodId) {
        return products.getFirst();
    }
}


