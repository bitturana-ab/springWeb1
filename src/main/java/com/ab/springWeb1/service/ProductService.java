package com.ab.springWeb1.service;

import com.ab.springWeb1.model.Product;
import com.ab.springWeb1.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

//    auto wire springboot,cause for interface wont be object.
    @Autowired
    ProductRepo repo;

//    create dummy data coll, but we should use DB for data
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(01,"samsung a54",34000),
//            new Product(02  ,"samsung a55",45000),
//            new Product(03,"samsung a53",42000)
//));

//    get all products
    public List<Product> getProducts(){
        return repo.findAll();
    }

// get product by prodId
    public Product getProductById(int prodId) {
//        or use stream api for filter but now im using for loop
//        for(int i = 0;i<products.toArray().length;i++){
//            if(products.get(i).getProdId() == prodId){
//                return products.get(i);
//            }
//        };
//        for(Product prod : products){
//            if(prod.getProdId() == prodId) return prod;
//        }
//        return new Product(0,"not found",00);

        return repo.findById(prodId).orElse(new Product());
    }

//    add Product to products and return message
    public String addProduct(Product prod){
//        products.add(prod);

        repo.save(prod);
        return "added";
    }

    public String updateProduct(Product prod) {
//        for(Product pro : products){
//            if(pro.getProdId()+1 == prod.getProdId()){
//                products.set(pro.getProdId(),prod);
//                return "updated";
//            }
//        }
//        update if was there else save
        repo.save(prod);
        return "updated";
    }

    public String deleteProduct(int prodId) {
//        if(products.removeIf(pro -> pro.getProdId() == prodId)) return "deleted";

//        another easy way
//        for (Product pro : products){
//            if(pro.getProdId() == prodId){
//                products.remove(pro);
//                return "deleted";
//            }
//        }

        repo.deleteById(prodId);
        return "deleted";
    }
}


