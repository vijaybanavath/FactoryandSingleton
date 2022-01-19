package test.ticket.factorypattern;

import test.ticket.singletonpattern.TicketsMaster;

public class ChildTicket extends TicketType {

	@Override
	public float getRate(int numberOfTickets) {
		TicketsMaster.getInstance().addChildTickets(numberOfTickets);
		return 150 * numberOfTickets;
	}

}
