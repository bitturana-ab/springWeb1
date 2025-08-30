package com.ab.springWeb1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Data
@AllArgsConstructor // create constructor auto
@Component
@Entity // covert class to db entity in ProductRepo
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int prodPrice;


    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", prodPrice=" + prodPrice +
                '}';
    }

    public int getProdId() {
        return prodId;
    }
}
