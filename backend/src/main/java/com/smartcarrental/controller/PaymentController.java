package com.smartcarrental.controller;

import com.smartcarrental.entity.Payment;
import com.smartcarrental.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/{bookingId}")
    public Payment pay(
            @PathVariable Long bookingId,
            @RequestParam String mode) {

        return paymentService.makePayment(bookingId, mode);
    }
}
