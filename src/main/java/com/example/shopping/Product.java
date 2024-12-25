package com.example.shopping;

import java.math.BigDecimal;

public class Product {

    private String name;
    private BigDecimal price;
    private Stock stock;

    public Product(String name, BigDecimal price, int quantity) {
        this.name = name;
        this.price = price;
        this.stock = new Stock(quantity);
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
        this.stock = new Stock();
    }

    public void validateStockAvailability() {
        if (stock.isQuantityAvailable()) {
            throw new IllegalStateException("out of stock");
        }
    }
}
