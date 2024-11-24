package com.example.ch_01;

import java.util.ArrayList;
import java.util.List;

/**
 * 매표소
 * - 티켓 목록
 * - 판매 금액
 */
public class TicketOffice {

    private List<Ticket> tickets;
    private Long amount;

    public TicketOffice(List<Ticket> tickets, Long amount) {
        this.tickets = tickets;
        this.amount = amount;
    }

    public Ticket getTicket() {
        return tickets.removeFirst();
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }
}