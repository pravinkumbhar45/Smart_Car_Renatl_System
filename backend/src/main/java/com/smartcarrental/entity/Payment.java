package com.smartcarrental.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentMode;
    private String paymentStatus;

    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    // getters and setters
}
