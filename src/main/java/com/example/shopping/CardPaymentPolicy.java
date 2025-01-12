package com.example.shopping;

import java.math.BigDecimal;

public class CardPaymentPolicy extends BasicPaymentPolicy {

    private String cardCompany;
    private String cardNumber;

    public CardPaymentPolicy(final BigDecimal amount, final String cardCompany, final String cardNumber) {
        super(amount);
        this.cardCompany = cardCompany;
        this.cardNumber = cardNumber;
    }

    @Override
    protected void makePayment(Order order) {
        System.out.println("pay by cardPayment amount : " + amount);
        System.out.println("request payment to cardCompany : " + cardCompany + ", cardNumber : " + cardNumber);
    }
}
