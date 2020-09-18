package com.geekbrains.spring.hibernate;

@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne
    @JoinColumn(name = "details_id")
    private PersonDetails details;

    public Person() {
    }

    public void print() {
        System.out.println("User id = " + id + "; name = " + name);
    }


}
