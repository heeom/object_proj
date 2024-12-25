package com.example.shopping;

public class Customer {

    private String name;
    private String email;
    private String address;
    private String mobileNumber;
    private ShoppingCart shoppingCart;

    public Customer(String name, String email, String address, String mobileNumber) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.shoppingCart = new ShoppingCart();
    }

    public void addCart(Product product) {
        product.validateStockAvailability();
        shoppingCart.add(product);
    }
}
