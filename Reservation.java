
public class Reservation {

	 int ticketID;
	 public Reservation(int tkt){
		 ticketID=tkt;
	 }
	 public void showTicket(){
		 System.out.println("TicketID:" +ticketID);
		 
	 }
	 public static void main(String args[]){
		 Reservation obj=new Reservation(10);
		 obj.showTicket();
	 }
}
