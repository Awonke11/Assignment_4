/**
 * The CarParkSim class contains the main car park simulation method.
 * It creates and manipulates the main objects, and handles user I/O.
 *
 * @author Awonke Mnotoza and ...
 * @version 16/6/2022
 */

public class Register {
    public Ticket[] tickets;
    public int numTickets;

    public Register() {
        this.tickets = new Ticket[100];
        this.numTickets = 0;
    }

    public void add(Ticket ticket) {
        this.tickets[this.numTickets] = ticket;
        this.numTickets++;
    }

    public boolean contains(String ticketID) {
        for (Ticket ticket : this.tickets) {
            if (ticket != null) {
                if ((ticket.id).equals(ticketID)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Ticket retrieve(String ticketID) {
        for (Ticket ticket : this.tickets) {
            if (ticket != null) {
                if ((ticket.id).equals(ticketID)) {
                    return ticket;
                }
            }
        }
        return null;
    }
}
