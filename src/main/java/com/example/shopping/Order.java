package com.example.shopping;

import java.math.BigDecimal;
import java.util.Map;

public class Order {

    private Customer customer;
    private Map<Product, Integer> products;
    private BigDecimal totalAmount;
    private OrderStatus status;

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
}
