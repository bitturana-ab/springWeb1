package com.ab.springWeb1.service;

import com.ab.springWeb1.model.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(102,"Sm-j6",14000),
            new Product(103,"sm-a31",19000),
            new Product(104,"Iphone-13pro",40000),
            new Product(105,"Iphone-14",45000));

    public Product getProductById(int prodId) {
        return products.stream() //steam api for easy find
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Product(100,"not item found",28)); // or get()
    }
}
