package test.ticket.factorypattern;

import test.ticket.singletonpattern.TicketsMaster;

public class SeniorCitizenTicket extends TicketType {

	@Override
	public float getRate(int numberOfTickets) {
		TicketsMaster.getInstance().addSeniorTickets(numberOfTickets);
		return 200*numberOfTickets;
	}

}
