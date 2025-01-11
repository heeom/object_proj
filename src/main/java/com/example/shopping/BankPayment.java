package com.example.shopping;

import com.example.shopping.vo.PaymentInfo;

public class BankPayment implements Pay {

    @Override
    public void makePayment(PaymentInfo paymentInfo) {
        System.out.printf("make payment by bank transfer. amount : %s, account number : %s", paymentInfo.getAmount(), paymentInfo.getInfo());
    }
}
