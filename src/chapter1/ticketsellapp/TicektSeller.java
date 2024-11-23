package chapter1.ticketsellapp;

public class TicektSeller {
    private TicketOffice ticketOffice;

    public TicektSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
