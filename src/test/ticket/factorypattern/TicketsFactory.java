package test.ticket.factorypattern;

public class TicketsFactory {
	
	public static TicketType getTicketType(String name) {
		switch(name) {
			case "Adult":
				return new AdultTicket();
			case "Child":
				return new ChildTicket();
			case "Senior":
				return new SeniorCitizenTicket();
			default:
				return null;
		}
	}

}
