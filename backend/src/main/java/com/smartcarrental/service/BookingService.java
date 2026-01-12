package com.smartcarrental.service;

import com.smartcarrental.dto.BookingRequest;
import com.smartcarrental.entity.Booking;

import java.util.List;

public interface BookingService {

    Booking createBooking(BookingRequest request);

    List<Booking> getBookingsByUser(Long userId);
}
