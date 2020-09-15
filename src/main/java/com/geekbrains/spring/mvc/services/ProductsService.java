package com.geekbrains.spring.mvc.services;

import com.geekbrains.spring.mvc.model.Product;
import com.geekbrains.spring.mvc.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductsService {
    private ProductsRepository productsRepository;

    @Autowired
    public void setStudentsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public List<Product> getAllProducts() {
        return productsRepository.findAll();
    }

    public Product saveOrUpdateProducts(Product product) {
        return productsRepository.saveOrUpdateProducts(product);
    }

    public Product findById(Long id) {
        return productsRepository.findById(id);
    }
}
