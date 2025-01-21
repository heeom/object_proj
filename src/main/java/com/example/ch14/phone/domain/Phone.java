package com.example.ch14.phone.domain;

import java.util.List;

public class Phone {

    private List<Call> call;

    public Phone(Call call) {
        this.call = List.of(call);
    }

    public List<Call> getCall() {
        return call;
    }
}

