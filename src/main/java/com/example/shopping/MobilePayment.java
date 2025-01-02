package com.example.shopping;

import java.math.BigDecimal;

public class MobilePayment implements Pay {

    @Override
    public void makePayment(BigDecimal amount, String info) {
        System.out.printf("make payment by mobile. amount : %d, mobile number : %s", amount, info);
    }
}
