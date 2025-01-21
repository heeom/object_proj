package com.example.ch14.refactor;

import com.example.ch14.phone.domain.DateTimeInterval;

import java.math.BigDecimal;
import java.time.Duration;

public class FeePerDuration {

    private BigDecimal fee;
    private Duration duration;

    public FeePerDuration(BigDecimal fee, Duration duration) {
        this.fee = fee;
        this.duration = duration;
    }

    public BigDecimal calculate(DateTimeInterval interval) {
        return fee.multiply(BigDecimal.valueOf(Math.ceil((double) interval.duration().toNanos() / duration.toNanos())));
    }
}
