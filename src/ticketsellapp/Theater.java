package ticketsellapp;

public class Theater {
    private TicektSeller ticektSeller;

    public Theater(TicektSeller ticektSeller) {
        this.ticektSeller = ticektSeller;
    }

    public void enter(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            Ticket ticket = ticektSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticektSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticektSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
