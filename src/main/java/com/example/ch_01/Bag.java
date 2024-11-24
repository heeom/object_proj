package com.example.ch_01;

/**
 * 관람객이 가지고 오는 Bag
 * - 현금
 * - 초대장
 * - 티켓
 */
public class Bag {

    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public Bag(Long amount) {
        this.amount = amount;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
