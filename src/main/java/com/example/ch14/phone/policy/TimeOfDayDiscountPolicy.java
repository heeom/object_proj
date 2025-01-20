package com.example.ch14.phone.policy;

import com.example.ch14.phone.domain.Call;
import com.example.ch14.phone.domain.DateTimeInterval;

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
        BigDecimal amount = BigDecimal.ZERO;
        call.splitByDay().forEach(interval -> {
            for (int loop = 0; loop < starts.size(); loop++) {
                BigDecimal charge = amounts.get(loop); // 구간별 통화 요금
                long callTime = Duration.between(from(interval, starts.get(loop)), to(interval, ends.get(loop)))
                        .getSeconds() / durations.get(loop).getSeconds(); // 구간별 통화 시간
                // 구간별 통화 요금 계산
                amount.add(charge.multiply(BigDecimal.valueOf(callTime)));
            }
        });
        return amount;
    }

    private LocalTime from(DateTimeInterval interval, LocalTime from) {
        return interval.getFrom().toLocalTime().isBefore(from) ?
                from :
                interval.getFrom().toLocalTime();

    }

    private LocalTime to(DateTimeInterval interval, LocalTime to) {
        return interval.getTo().toLocalTime().isAfter(to) ?
                to :
                interval.getTo().toLocalTime();
    }
}
