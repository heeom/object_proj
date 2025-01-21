package com.example.ch14.refactor;

import com.example.ch14.phone.domain.Call;
import com.example.ch14.phone.domain.DateTimeInterval;

import java.util.List;

public interface FeeCondition {

    /**
     * Call 통화 기간 중에서 적용 조건을 만족하는 기간을 구한 후 List에 담아서 반환
     * @param call call
     */
    List<DateTimeInterval> findTimeIntervals(Call call);
}
