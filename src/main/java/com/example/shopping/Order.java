package com.example.shopping;

import com.example.shopping.vo.PaymentInfo;

import java.math.BigDecimal;
import java.util.Map;

public class Order {

    private Customer customer;
    private Map<Product, Integer> products;
    private BigDecimal totalAmount;
    private BigDecimal paidAmount;
    private OrderStatus status;
    private PayType payType;

    public Order(Customer customer, Map<Product, Integer> products) {
        if (products == null || products.isEmpty()) {
            throw new IllegalArgumentException("products cannot be null or empty");
        }
        this.customer = customer;
        this.products = products;
        this.totalAmount = calculateTotalAmount(products);
        this.status = OrderStatus.PENDING;
    }

    private BigDecimal calculateTotalAmount(Map<Product, Integer> products) {
        return products.entrySet()
                .stream()
                .map(entry -> entry.getKey().calculatePrice(entry.getValue()))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void pay(PayType payType, PaymentInfo paymentInfo, PaymentProcessor paymentProcessor) {
        paymentProcessor.processPayment(payType, paymentInfo);
        this.payType = payType;
        this.status = OrderStatus.PAID;
        this.paidAmount = paymentInfo.getAmount();
    }
}
