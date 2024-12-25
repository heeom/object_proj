package com.example.shopping;

public class Stock {

    private Integer quantity;

    protected Stock(Integer quantity) {
        this.quantity = quantity;
    }

    protected Stock() {
        this.quantity = 0;
    }
}
