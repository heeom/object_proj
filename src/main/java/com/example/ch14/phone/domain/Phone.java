package com.example.ch14.phone.domain;

public class Phone {

    private Call call;

    public Phone(Call call) {
        this.call = call;
    }

    public Call getCall() {
        return call;
    }
}

