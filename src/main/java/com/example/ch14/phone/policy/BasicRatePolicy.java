package com.example.ch14.phone.policy;

import com.example.ch14.phone.domain.Call;
import com.example.ch14.phone.domain.Phone;

import java.math.BigDecimal;

public abstract class BasicRatePolicy implements RatePolicy {

    @Override
    public void calculateRate(Phone phone) {
        System.out.println("BasicRatePolicy.calculateRate");
    }

    abstract BigDecimal calculateCallFee(Call call);
}
