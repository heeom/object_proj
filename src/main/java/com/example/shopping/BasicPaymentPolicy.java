package com.example.shopping;

public abstract class BasicPaymentPolicy implements PaymentPolicy {

    @Override
    public void pay(Order order) {
        makePayment(order);
        System.out.println("payment succeeded. change order status to paid : " + order);
        order.changeStatus(OrderStatus.PAID);
    }

    protected abstract void makePayment(Order order);
}
