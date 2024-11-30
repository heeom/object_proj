package com.example.ticketoffice;

import java.time.LocalDateTime;

/**
 * 이벤트 당첨자에게 발송되는 초대장
 */
public class Invitation {

    private LocalDateTime when; // 초대일자 (영화 관람 가능일)

    public Invitation(LocalDateTime when) {
        this.when = when;
    }
}
