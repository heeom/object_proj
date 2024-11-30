package com.example.screen;


public class AmountDiscountPolicy extends DiscountPolicy {

    private final Money discountAmount;

    public AmountDiscountPolicy(final Money discountAmount, final DiscountCondition  ...discountConditions) {
        super(discountConditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
