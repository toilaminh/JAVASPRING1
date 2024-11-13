package com.example.javaspring1.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity(name = "store")
@Getter
@Setter
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "manager_staff_id")
    private Staff manager;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "store")
    private Set<Inventory> inventories;

    @OneToMany(mappedBy = "store")
    private Set<Staff> staff;

    @OneToMany(mappedBy = "store")
    private Set<Customer> customers;
}
