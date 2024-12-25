package com.example.shopping;

public class Customer {

    private String name;
    private String email;
    private String address;
    private String mobileNumber;
    private ShoppingCart shoppingCart;

    public void addCart(Product product) {
        shoppingCart.add(product);
    }
}
