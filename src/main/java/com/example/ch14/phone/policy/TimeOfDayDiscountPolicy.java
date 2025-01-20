package com.example.ch14.phone.policy;

import com.example.ch14.phone.domain.Call;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TimeOfDayDiscountPolicy extends BasicRatePolicy {

    private List<LocalTime> starts = new ArrayList<>();
    private List<LocalTime> ends = new ArrayList<>();
    private List<Duration> durations = new ArrayList<>();
    private List<BigDecimal> amounts = new ArrayList<>();

    @Override
    BigDecimal calculateCallFee(Call call) {

        return null;
    }
}
