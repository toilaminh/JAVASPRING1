package com.example.javaspring1.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity(name = "address")
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer id;
    private String address;
    private String address2;
    private String district;
    @Column(name = "postal_code")
    private String postalCode;
    private String phone;
    private String location;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @OneToMany(mappedBy = "address")
    private Set<Store> stores;

    @OneToMany(mappedBy = "address")
    private Set<Staff> staffs;
}
