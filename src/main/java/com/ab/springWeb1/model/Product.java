package com.ab.springWeb1.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter // all getter fun created auto by lombok
@Setter // all setter fun
@NoArgsConstructor
@Data
@AllArgsConstructor // create constructor auto
@Component
public class Product {

    private int prodId;
    private String prodName;
    private int prodPrice;

    public Product(int prodId) {
        this.prodId = prodId;
    }

}
