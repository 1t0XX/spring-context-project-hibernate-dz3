package com.geekbrains.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Cart {

    private List<Productt> producttList;
    private ProductRepository productRepository;

    @Autowired
    public Cart(List<Productt> producttList, ProductRepository productRepository){
        this.producttList = producttList;
        this.productRepository = productRepository;
    }

    public List<Productt> getProductList(){
        return this.producttList;
    }

    public void addProductById(Long id){
        this.producttList.add(ProductRepository.findById(id));
    }

    public void deleteProductById(Long id){
        this.producttList.add(ProductRepository.findById(id));
    }
}
