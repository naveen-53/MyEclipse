package JavaTopics;

public class TicketCategory {
	
	public interface ITTicketCategory{
		
		String getDetailDescription();
	}
	/*public enum Ticketcategorynew implements ITTicketCategory{
		CRITICAL(description:"Critical"),HIGH(description:"High"),MEDIUM(description:"Medium"),LOW(description:"Low")
		
		Private String description;
		
		Ticketcategorynew(String description){
			this.description=description;
		}
		public String getDetailDescription() {
			return "Detailed Description is"+description;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Ticketcategorynew tc: Ticketcategorynew.values()) {
			System.out.println(tc.getDetailDescription());
		}

	}*/

}
