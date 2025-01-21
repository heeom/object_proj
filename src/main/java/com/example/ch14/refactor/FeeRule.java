package com.example.ch14.refactor;

import com.example.ch14.phone.domain.Call;

import java.math.BigDecimal;

public class FeeRule {

    private FeeCondition feeCondition;
    private FeePerDuration feePerDuration;

    public FeeRule(FeeCondition feeCondition, FeePerDuration feePerDuration) {
        this.feeCondition = feeCondition;
        this.feePerDuration = feePerDuration;
    }

    public BigDecimal calculateFee(Call call) {
        return feeCondition.findTimeIntervals(call)
                .stream().map(con -> feePerDuration.calculate(con))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
