package com.geekbrains.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Cart cart = context.getBean("cart", Cart.class);

        cart.addProductById(3L);
        cart.addProductById(2L);

        System.out.println(cart.getProductList());
        cart.deleteProductById(3L);

        System.out.println(cart.getProductList());

        context.close();

    }
}
