import java.util.HashMap;
import java.util.Map;

class task_2 {
    public static void main(String[] args) {
        
        HashMap<Integer, String> ticketBooking = new HashMap<>();

        
        ticketBooking.put(1, "Cathrine - Dindigul to Chennai");
        ticketBooking.put(2, "Praba - Madurai to Theni");
        ticketBooking.put(3, "Peter - Trichy to Chennai");

      
        System.out.println("All Tickets:");
        for (Map.Entry<Integer, String> entry : ticketBooking.entrySet()) {
            System.out.println("Ticket ID: " + entry.getKey() + " | " + entry.getValue());
        }

        
        int searchId = 2; 
        if (ticketBooking.containsKey(searchId)) {
            System.out.println("\nTicket found for ID " + searchId + ": " + ticketBooking.get(searchId));
        } else {
            System.out.println("\nTicket ID " + searchId + " not found.");
        }

       
        ticketBooking.put(2, "Praba - Updated: Madurai to Coimbatore");
        System.out.println("\nUpdated Ticket ID 2: " + ticketBooking.get(2));

        
        ticketBooking.remove(1);
        System.out.println("\nTicket ID 1 has been canceled.");

        
        System.out.println("\nRemaining Tickets:");
        for (Map.Entry<Integer, String> entry : ticketBooking.entrySet()) {
            System.out.println("Ticket ID: " + entry.getKey() + " | " + entry.getValue());
        }
    }
}
