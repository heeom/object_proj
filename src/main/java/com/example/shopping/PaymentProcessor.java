package com.example.shopping;

import com.example.shopping.vo.PaymentInfo;

public class PaymentProcessor {

    private PayFactory payFactory;

    public PaymentProcessor(PayFactory payFactory) {
        this.payFactory = payFactory;
    }

    public void processPayment(PayType payType, PaymentInfo paymentInfo) {
        Pay pay = payFactory.getPayMethod(payType);
        pay.makePayment(paymentInfo);
        System.out.println("payment processed successfully. type: " + payType + " payment information: " + paymentInfo);
    }
}
