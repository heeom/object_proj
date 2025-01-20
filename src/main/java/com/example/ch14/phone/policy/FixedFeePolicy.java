package com.example.ch14.phone.policy;

import com.example.ch14.phone.domain.Call;

import java.math.BigDecimal;
import java.time.Duration;

public class FixedFeePolicy extends BasicRatePolicy {

    private BigDecimal amount;
    private Duration duration;

    public FixedFeePolicy(BigDecimal amount, Duration duration) {
        this.amount = amount;
        this.duration = duration;
    }

    @Override
    BigDecimal calculateCallFee(Call call) {
        return amount.multiply(BigDecimal.valueOf(call.getDuration().getSeconds() / duration.getSeconds()));
    }
}
