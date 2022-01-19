package test.ticket.singletonpattern;

public class TicketsMaster {
	
	private static TicketsMaster object;
	private int totalAdultsTickets = 0;
	private int totalChildTickets = 0;
	private int totalSeniorTickets = 0;
	
	private TicketsMaster() {
		
	}
	public static TicketsMaster getInstance() {
		if(object == null ) {
			object = new TicketsMaster();
		}
		return object;
	}
	
	public void addAdultTickets(int tickets) {
		totalAdultsTickets = totalAdultsTickets + tickets;
	}
	
	public void addChildTickets(int tickets) {
		totalChildTickets = totalChildTickets + tickets;
	}
	
	public void addSeniorTickets(int tickets) {
		totalSeniorTickets = totalSeniorTickets + tickets;
	}
	public int getTotalAdultsTickets() {
		return totalAdultsTickets;
	}
	public int getTotalChildTickets() {
		return totalChildTickets;
	}
	public int getTotalSeniorTickets() {
		return totalSeniorTickets;
	}
	
	public int getTotalTickets() {
		return totalAdultsTickets + totalChildTickets + totalSeniorTickets;
	}

}
