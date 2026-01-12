package com.smartcarrental.service;

import com.smartcarrental.entity.Payment;

public interface PaymentService {

    Payment makePayment(Long bookingId, String paymentMode);
}
