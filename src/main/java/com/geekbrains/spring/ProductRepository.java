package com.geekbrains.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {

    static List<Product> products;

    @PostConstruct
    public void init(){
        this.products= new ArrayList<>();
        this.products.add(new Product(2L, "lodka", 34L));
        this.products.add(new Product(3L, "kater", 340L));
        this.products.add(new Product(4L, "korabl", 3400L));
    }

    public static Product findById(Long id){
        for(Product product : products){
            if (product.getId().equals(id)) {
                return product;
            }
        }
        throw new RuntimeException("Product not found");
    }

    public List<Product> findAll(){
        return Collections.unmodifiableList(products);
    }
}
