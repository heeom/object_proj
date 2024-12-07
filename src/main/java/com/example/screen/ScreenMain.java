package com.example.screen;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ScreenMain {

    public static void main(String[] args) {
        Movie harryPotter = new Movie(
                "Harry Potter",
                Duration.of(120, ChronoUnit.MINUTES),
                new Money(10000),
                new AmountDiscountPolicy(
                        new Money(1000),
                        new SequenceCondition(1),
                        new SequenceCondition(10),
                        new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
                        new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(20, 59))
                )
        );

        Movie dune = new Movie(
                "Dune",
                Duration.of(180, ChronoUnit.MINUTES),
                new Money(20000),
                new PercentDiscountPolicy(
                        10,
                        new SequenceCondition(10),
                        new PeriodCondition(DayOfWeek.TUESDAY, LocalTime.of(10, 0), LocalTime.of(11, 59))
                )
        );

        Screening screening = new Screening(harryPotter, 10, LocalDateTime.of(2024, 12, 24, 10, 30));
        Money money = harryPotter.calculateMovieFee(screening);
        System.out.println(money);
    }
}
