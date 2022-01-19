package test.ticket;

import test.ticket.factorypattern.TicketType;
import test.ticket.factorypattern.TicketsFactory;
import test.ticket.singletonpattern.TicketsMaster;

public class TicketsSystem {
	
	public static void main(String args[]) {
		
		TicketType adultTicket = TicketsFactory.getTicketType("Adult");
		TicketType seniorTicket = TicketsFactory.getTicketType("Senior");
		TicketType childTicket = TicketsFactory.getTicketType("Child");
		
		float adultTicketRate = adultTicket.getRate(4);
		System.out.println("Adult ticket rate for 4 persons = " + adultTicketRate);
		float seniorTicketRate = seniorTicket.getRate(2);
		System.out.println("Senior ticket rate for 2 persons = " + seniorTicketRate);
		float childTicketRate = childTicket.getRate(3);
		System.out.println("Child ticket rate for 3 persons = " + childTicketRate);
		
		TicketsMaster ticketsObj = TicketsMaster.getInstance();
		System.out.println("Adult Tickets count = " + ticketsObj.getTotalAdultsTickets());
		System.out.println("Child Tickets count = " + ticketsObj.getTotalChildTickets());
		System.out.println("Senior Tickets count = " + ticketsObj.getTotalSeniorTickets());
		System.out.println("Total Tickets count = " + ticketsObj.getTotalTickets());
		
		
	}

}
