package com.example.shopping;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private final Map<Product, Integer> products;

    public ShoppingCart() {
        this.products = new HashMap<>();
    }

    public void add(Product product) {
        this.add(product, 1);
    }
    public void add(Product product, Integer count) {
        Integer quantity = this.products.putIfAbsent(product, 0);
        this.products.put(product, quantity + count);
    }

    public void showList() {
        products.forEach((key, value) -> System.out.println(key + "[" + value + "]"));
    }
}
