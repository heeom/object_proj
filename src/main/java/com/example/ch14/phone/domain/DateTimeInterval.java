package com.example.ch14.phone.domain;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeInterval {

    private LocalDateTime from;
    private LocalDateTime to;

    public DateTimeInterval(LocalDateTime from, LocalDateTime to) {
        this.from = from;
        this.to = to;
    }

    // from ~ from 자정
    public static DateTimeInterval toMidnight(LocalDateTime from) {
        return new DateTimeInterval(from, from.plusDays(1).with(LocalTime.of(0,0,0).minusNanos(1)));
    }

    // to 자정 ~ to
    public static DateTimeInterval fromMidnight(LocalDateTime to) {
        return new DateTimeInterval(
                LocalDateTime.of(to.toLocalDate(), LocalTime.of(0, 0)),
                to
        );
    }

    // date 00 ~ 24
    public static DateTimeInterval during(LocalDate date) {
        return new DateTimeInterval(
                LocalDateTime.of(date, LocalTime.of(0,0)),
                LocalDateTime.of(date, LocalTime.MAX)
        );
    }

    public Duration duration() {
        return Duration.between(from, to);
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }
}
