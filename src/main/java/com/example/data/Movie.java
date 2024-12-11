package com.example.data;


import java.math.BigDecimal;
import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;

    //
    private List<DiscountCondition> discountConditions;
    private MovieType movieType; // 객체의 종류를 정한다
    // 정책 타입에 따라 discountAmount, discountPercent 둘 중 하나를 사용한다
    private Money discountAmount;
    private BigDecimal discountPercent;

    public Money getFee() {
        return fee;
    }

    public void setFee(Money fee) {
        this.fee = fee;
    }

    public List<DiscountCondition> getDiscountConditions() {
        return Collections.unmodifiableList(discountConditions);
    }

    public void setDiscountConditions(List<DiscountCondition> discountConditions) {
        this.discountConditions = discountConditions;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public Money getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Money discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(BigDecimal discountPercent) {
        this.discountPercent = discountPercent;
    }
}
