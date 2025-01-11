package com.example.shopping;

import java.math.BigDecimal;

public class CardPayment implements Pay {

    @Override
    public void makePayment(BigDecimal amount, String info) {
        System.out.printf("make payment by card. amount : %d, card number : %s", amount, info);
    }
}
