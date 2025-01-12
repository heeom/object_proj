package com.example.shopping;

import java.math.BigDecimal;

public class BankPaymentPolicy extends BasicPaymentPolicy {

    private String bank;
    private String accountNumber;

    public BankPaymentPolicy(BigDecimal amount, String bank, String accountNumber) {
        super(amount);
        this.bank = bank;
        this.accountNumber = accountNumber;
    }

    @Override
    protected void makePayment(Order order) {
        System.out.println("pay by bank amount : " + amount);
        System.out.println("request payment to bank : " + bank + ", accountNumber : " + accountNumber);
    }
}
