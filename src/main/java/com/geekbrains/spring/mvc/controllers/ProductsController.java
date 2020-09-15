package com.geekbrains.spring.mvc.controllers;

import com.geekbrains.spring.Product;
import com.geekbrains.spring.mvc.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// root: http://localhost:8189/app/students

@Controller
@RequestMapping("/products")
public class ProductsController {
    private ProductsService productsService;

    @Autowired
    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping
    public String showAllProducts(Model model) {
        List<com.geekbrains.spring.mvc.model.Product> products = productsService.getAllProducts();
        model.addAttribute("products", products);
        return "all_products";
    }

    @GetMapping("/add")
    public String showAddForm() {
        return "add_products_form";
    }


    @PostMapping("/add")
    public String saveNewProduct(@ModelAttribute Product newProduct) {
        productsService.saveOrUpdateProducts(newProduct);
        return "redirect:/product   s/";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("product", productsService.findById(id));
        return "edit_product_form";
    }

    @PostMapping("/edit")
    public String modifyProduct(@ModelAttribute Product modifiedProduct) {
        productsService.saveOrUpdateProducts(modifiedProduct);
        return "redirect:/products/";
    }

    @GetMapping("/json/{id}")
    @ResponseBody
    public com.geekbrains.spring.mvc.model.Product showJsonProduct(@PathVariable Long id) {
        return productsService.findById(id);
    }
}
