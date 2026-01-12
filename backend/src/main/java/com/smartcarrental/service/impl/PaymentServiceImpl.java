package com.smartcarrental.service.impl;

import com.smartcarrental.entity.Booking;
import com.smartcarrental.entity.Payment;
import com.smartcarrental.repository.BookingRepository;
import com.smartcarrental.repository.PaymentRepository;
import com.smartcarrental.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final BookingRepository bookingRepository;

    public PaymentServiceImpl(
            PaymentRepository paymentRepository,
            BookingRepository bookingRepository) {

        this.paymentRepository = paymentRepository;
        this.bookingRepository = bookingRepository;
    }

    @Override
    public Payment makePayment(Long bookingId, String paymentMode) {

        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found"));

        Payment payment = new Payment();
        payment.setBooking(booking);
        payment.setPaymentMode(paymentMode);
        payment.setPaymentStatus("SUCCESS");

        return paymentRepository.save(payment);
    }
}
