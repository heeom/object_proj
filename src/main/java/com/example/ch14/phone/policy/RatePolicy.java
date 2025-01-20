package com.example.ch14.phone.policy;

import com.example.ch14.phone.domain.Phone;

public interface RatePolicy {

    void calculateRate(Phone phone);
}
