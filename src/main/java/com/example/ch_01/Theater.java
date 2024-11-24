package com.example.ch_01;


public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        // 초대장 있는 관람객
        if (audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            // 티켓 판매
            Long fee = ticket.getFee();
            audience.getBag().minusAmount(fee);
            ticketSeller.getTicketOffice().plusAmount(fee);

            audience.getBag().setTicket(ticket);
        }
    }
}
