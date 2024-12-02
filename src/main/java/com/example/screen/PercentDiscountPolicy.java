package com.example.screen;

import java.math.BigDecimal;

public class PercentDiscountPolicy extends DiscountPolicy {

    private final BigDecimal percent;

    public PercentDiscountPolicy(final BigDecimal percent, final DiscountCondition... discountConditions) {
        super(discountConditions);
        this.percent = percent;
    }

    public PercentDiscountPolicy(final long percent,  final DiscountCondition... discountConditions) {
        super(discountConditions);
        this.percent = BigDecimal.valueOf(percent);
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
