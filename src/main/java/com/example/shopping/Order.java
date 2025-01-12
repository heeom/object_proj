package com.example.shopping;


import java.math.BigDecimal;
import java.util.Map;

public class Order {

    private Customer customer;
    private Map<Product, Integer> products;
    private BigDecimal totalAmount;
    private OrderStatus status;
    private PaymentPolicy paymentPolicy; // 합성

    public Order(Customer customer, Map<Product, Integer> products) {
        if (products == null || products.isEmpty()) {
            throw new IllegalArgumentException("products cannot be null or empty");
        }
        this.customer = customer;
        this.products = products;
        this.totalAmount = calculateTotalAmount(products);
        this.status = OrderStatus.PENDING;
    }

    // setPaymentPolicy 메서드로 PaymentPolicy 인스턴스에 대한 의존성을 런타임에 주입받는다.
    public void setPaymentPolicy(PaymentPolicy paymentPolicy) {
        if (paymentPolicy == null) {
            throw new IllegalArgumentException("paymentPolicy cannot be null");
        }
        this.paymentPolicy = paymentPolicy;
    }

    private BigDecimal calculateTotalAmount(Map<Product, Integer> products) {
        return products.entrySet()
                .stream()
                .map(entry -> entry.getKey().calculatePrice(entry.getValue()))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }


    public void changeStatus(OrderStatus status) {
        this.status = status;
    }

    public void pay() {
        paymentPolicy.pay(this);
    }

    public void cancel() {
        if (isCancelable()) {
            status = OrderStatus.CANCELLED;
        }
    }

    private boolean isCancelable() {
        return status == OrderStatus.PENDING;
    }

}
