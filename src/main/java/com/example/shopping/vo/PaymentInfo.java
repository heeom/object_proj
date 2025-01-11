package com.example.shopping.vo;

import java.math.BigDecimal;

public class PaymentInfo {
    private BigDecimal amount;
    private String info;

    public PaymentInfo(final BigDecimal amount, final String info) {
        this.amount = amount;
        this.info = info;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "PaymentInfo{" +
                "amount=" + amount +
                ", info='" + info + '\'' +
                '}';
    }
}
