package com.geekbrains.spring.hibernate;

@Entity
@Table(name = "items")
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "cost")
    private int cost;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Items() {
    }

    public void print() {
        System.out.println("Item id = " + id + "; title = " + title + "cost = " + cost);
    }
}
