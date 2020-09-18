package com.geekbrains.spring.hibernate;

@Entity
@Table(name = "persons_details")
public class PersonDetails {
    @Id
    @GeneratedValue
    @Column(name = "id")
    Long id;

    @OneToOne(mappedBy = "details")
    Person person;

    // ...
}
