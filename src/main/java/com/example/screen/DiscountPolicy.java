package com.example.screen;


import java.util.ArrayList;
import java.util.List;

public abstract class DiscountPolicy {

    private final List<DiscountCondition> conditions;

    public DiscountPolicy() {
        this.conditions = new ArrayList<>();
    }

    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition condition : conditions) {
            if (condition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening); // 하위클래스가 구현
}
