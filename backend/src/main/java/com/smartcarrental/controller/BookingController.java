package com.smartcarrental.controller;

import com.smartcarrental.dto.BookingRequest;
import com.smartcarrental.entity.Booking;
import com.smartcarrental.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public Booking bookCar(@RequestBody BookingRequest request) {
        return bookingService.createBooking(request);
    }

    @GetMapping("/user/{userId}")
    public List<Booking> getUserBookings(@PathVariable Long userId) {
        return bookingService.getBookingsByUser(userId);
    }
}
