package com.cursoms.hrpayroll.services;

import com.cursoms.hrpayroll.entities.Payment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, Integer days) {

        return new Payment("Bob", 200.0, days);
    }
}
