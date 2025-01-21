package com.example.ch14.refactor;

import com.example.ch14.phone.domain.Call;
import com.example.ch14.phone.domain.Phone;
import com.example.ch14.phone.policy.RatePolicy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BasicRatePolicy implements RatePolicy {

    private List<FeeRule> feeRules = new ArrayList<>();

    public BasicRatePolicy(List<FeeRule> feeRules) {
        this.feeRules = feeRules;
    }

    @Override
    public BigDecimal calculateFee(Phone phone) {
        return phone.getCall()
                .stream().map(this::calculate)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private BigDecimal calculate(Call call) {
        return feeRules.stream().map(rule -> rule.calculateFee(call))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
