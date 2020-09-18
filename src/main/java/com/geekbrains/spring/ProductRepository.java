package com.geekbrains.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {

    static List<Productt> productts;

    @PostConstruct
    public void init(){
        this.productts = new ArrayList<>();
        this.productts.add(new Productt(2L, "lodka", 34L));
        this.productts.add(new Productt(3L, "kater", 340L));
        this.productts.add(new Productt(4L, "korabl", 3400L));
    }

    public static Productt findById(Long id){
        for(Productt productt : productts){
            if (productt.getId().equals(id)) {
                return productt;
            }
        }
        throw new RuntimeException("Product not found");
    }

    public List<Productt> findAll(){
        return Collections.unmodifiableList(productts);
    }
}
