package com.example.shopping;

import java.math.BigDecimal;

public abstract class BasicRefundPolicy implements RefundPolicy {

    protected BigDecimal refundAmount;

    protected BasicRefundPolicy(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    @Override
    public void refund(Order order) {
        requestRefund(order);
        System.out.println("refund succeeded. amount : " + refundAmount);
        order.changeStatus(OrderStatus.REFUNDED);
    }


    protected abstract void requestRefund(Order order);
}
