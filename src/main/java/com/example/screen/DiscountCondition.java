package com.example.screen;

public interface DiscountCondition {

    /**
     * 할인이 가능한 상영 여부를 체크한다.
     * @param screening 상영정보
     * @return 할인 가능하면 true를 반환함
     */
    boolean isSatisfiedBy(Screening screening);
}
