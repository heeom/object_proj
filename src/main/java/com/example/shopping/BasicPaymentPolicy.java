package com.example.shopping;

import java.math.BigDecimal;

public abstract class BasicPaymentPolicy implements PaymentPolicy {

    protected BigDecimal amount;

    protected BasicPaymentPolicy(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public void pay(Order order) {
        makePayment(order);
        System.out.println("payment succeeded. change order status to paid : " + order);
        order.changeStatus(OrderStatus.PAID);
    }

    protected abstract void makePayment(Order order);
}
