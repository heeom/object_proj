package com.example.ch14.phone.policy;

import com.example.ch14.phone.domain.Call;
import com.example.ch14.phone.domain.Phone;

import java.math.BigDecimal;
import java.time.Duration;

public class DurationDiscountRule extends FixedFeePolicy {
    private Duration from;
    private Duration to;

    public DurationDiscountRule(BigDecimal amount, Duration duration, Duration from, Duration to) {
        super(amount, duration);
        this.from = from;
        this.to = to;
    }

    public BigDecimal calculate(Call call) {
        if (call.getDuration().compareTo(to) > 0 || to.compareTo(from) < 0) {
            return BigDecimal.ZERO;
        }
        Phone phone = new Phone(
                new Call(call.getFrom().plus(from),
                        call.getDuration().compareTo(to) > 0 ? call.getFrom().plus(to) : call.getTo())
        );
        return super.calculateFee(phone);
    }
}
