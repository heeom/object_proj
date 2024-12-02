package com.example.screen;

import java.time.Duration;

public class Movie {

    private String title;
    private Duration runningTime;
    private Money fee; // 정가
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    /**
     * 상영 정보를 받아서 할인된 영화요금을 계산한다
     * @param screening 상영정보
     * @return 할인이 적용된 영화요금
     */
    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
