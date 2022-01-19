package test.ticket.factorypattern;

import test.ticket.singletonpattern.TicketsMaster;

public class AdultTicket extends TicketType {

	@Override
	public float getRate(int numberOfTickets) {
		TicketsMaster.getInstance().addAdultTickets(numberOfTickets);
		return 300 * numberOfTickets;
	}

}
