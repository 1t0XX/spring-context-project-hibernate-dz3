package com.geekbrains.spring;

public class Productt {
    private long id;
    private String title;
    private long cost;

    public Productt(Long id, String title, Long cost){
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public Productt(){}


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
