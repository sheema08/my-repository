import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   public static void main(String args[])throws IOException{
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   Port[] port = new Port[4];
	   port[0]=new Port(1,"India","Chennai");
		port[1]=new Port(2,"America","California");
		port[2]=new Port(3,"England","London");
		port[3]=new Port(4,"Australia","Melbourne");
	   Shipment shipment=new Shipment();
	   
	   System.out.println("Enter the Shipment Id ");
	   shipment.setId(Integer.parseInt(br.readLine()));
	   System.out.println("Enter the Shipment Name ");
	   shipment.setName(br.readLine());
	   System.out.println("Available ports are");
	   System.out.format("%-15s %-15s %s","ID","Country","PortName");
	   for(int i=0;i<port.length;i++)
	   {
		   System.out.format("\n%-15s %-15s %s",port[i].getId(),port[i].getCountry(),port[i].getName());
	   }
	   //fill the code	   
	   System.out.println("\nEnter the arrival port name");
	   String arrival = br.readLine();
	   StringBuilder builder = new StringBuilder(arrival);
	   if(arrival.charAt(0) != arrival.toUpperCase().charAt(0)){
		   builder.deleteCharAt(0);
		   builder.insert(0, arrival.toUpperCase().charAt(0));
		   arrival = builder.toString();
	   }
	   
	   System.out.println("Enter the departure port name");
	   String departure = br.readLine();
	   builder = new StringBuilder(departure);
	   if(departure.charAt(0) != departure.toUpperCase().charAt(0)){
		   builder.deleteCharAt(0);
		   builder.insert(0, departure.toUpperCase().charAt(0));
		   departure = builder.toString();
	   }
	   
	   try{
		   if(new ShipmentBO().validateShipment(arrival, departure, port))
			   new ShipmentBO().displayShipmentDetails(shipment, port, arrival, departure);
	   }catch(InvalidPortException e){
		   System.out.println(e);
	   }
	   
	   
   }
}
