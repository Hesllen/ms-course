package com.cursoms.hrpayroll.services;

import com.cursoms.hrpayroll.entities.Payment;
import com.cursoms.hrpayroll.entities.Worker;
import com.cursoms.hrpayroll.feignClientes.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, Integer days) {

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
