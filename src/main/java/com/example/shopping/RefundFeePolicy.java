package com.example.shopping;

import java.math.BigDecimal;

public abstract class RefundFeePolicy implements RefundPolicy {

    private RefundPolicy before;
    private boolean chargeFee;
    private BigDecimal feeRate;

    @Override
    public void refund(Order order) {

    }

    abstract protected void calculateFee(BigDecimal rate);
}
