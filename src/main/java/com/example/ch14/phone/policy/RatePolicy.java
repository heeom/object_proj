package com.example.ch14.phone.policy;

import com.example.ch14.phone.domain.Phone;

import java.math.BigDecimal;

public interface RatePolicy {

    BigDecimal calculateFee(Phone phone);
}
