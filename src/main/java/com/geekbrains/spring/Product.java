package com.geekbrains.spring;

public class Product {
    private long id;
    private String title;
    private long cost;

    public Product(Long id, String title, Long cost){
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public Product(){}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product(" + "id=" + id + " , title =" + title + " , cost= " +cost + ")"  ;
    }
}
