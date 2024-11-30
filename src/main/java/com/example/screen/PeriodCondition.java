package com.example.screen;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition {

    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return isDayMatch(screening.getWhenScreened().getDayOfWeek())
                && isTimeMatch(screening.getStartTime());
    }

    private boolean isDayMatch(DayOfWeek whenScreened) {
        return whenScreened.equals(dayOfWeek);
    }

    private boolean isTimeMatch(LocalTime whenScreened) {
        return whenScreened.isAfter(startTime) && whenScreened.isBefore(endTime);
    }

}
