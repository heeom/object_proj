package com.example.shopping;

import com.example.shopping.vo.PaymentInfo;


public class CardPayment implements Pay {

    @Override
    public void makePayment(PaymentInfo paymentInfo) {
        System.out.printf("make payment by card. amount : %s, card number : %s", paymentInfo.getAmount(), paymentInfo.getInfo());
    }
}
