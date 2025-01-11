package com.example.shopping;

import com.example.shopping.vo.PaymentInfo;

public class MobilePayment implements Pay {

    @Override
    public void makePayment(PaymentInfo paymentInfo) {
        System.out.printf("make payment by mobile. amount : %d, mobile number : %s", paymentInfo.getAmount(), paymentInfo.getInfo());
    }
}
