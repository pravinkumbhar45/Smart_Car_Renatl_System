package com.smartcarrental.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private String fuelType;
    private double pricePerDay;
    private boolean available;

    // getters and setters
}
