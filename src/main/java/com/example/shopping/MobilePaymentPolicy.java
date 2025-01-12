package com.example.shopping;

import java.math.BigDecimal;

public class MobilePaymentPolicy extends BasicPaymentPolicy {

    private String telecoms;
    private String phoneNumber;

    public MobilePaymentPolicy(BigDecimal amount, String telecoms, String phoneNumber) {
        super(amount);
        this.telecoms = telecoms;
        this.phoneNumber = phoneNumber;
    }

    @Override
    protected void makePayment(Order order) {
        System.out.println("pay by mobile amount : " + amount);
        System.out.println("request payment to telecoms : " + telecoms + ", phoneNumber : " + phoneNumber);
    }
}
