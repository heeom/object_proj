package com.example.ticketoffice;

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

    private boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            this.ticket = ticket;
            return 0L;
        } else {
            this.minusAmount(ticket.getFee());
            this.ticket = ticket;
            return ticket.getFee();
        }
    }
}
