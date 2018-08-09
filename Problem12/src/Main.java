import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of shipments :");
		int noOfShipments = sc.nextInt();
		Shipment[] shipmentList = new Shipment[noOfShipments];
		
		String name = "";
		String mode = "";
		double weight = 0.0;
		String arrivalPort = "";
		String departurePort = "";
	    for(int i = 0;i < noOfShipments;i++){
		   System.out.println("Enter the shipment "+(i+1) +" details");
		   
		   if(sc.nextLine().isEmpty()){
			   System.out.print("");
		   }
		   
		   System.out.println("Enter the shipper name :");
		   name = sc.nextLine();
		   
		   System.out.println("Enter the mode of transportation :");
		   mode = sc.next();
		   
		   System.out.println("Enter the total weight :");
		   weight = sc.nextDouble();
		   	   
		   System.out.println("Enter the arrival port :");
		   arrivalPort = sc.next();
		   
		   System.out.println("Enter the departure port :");
		   departurePort = sc.next();
		   
		   shipmentList[i] = Shipment.createNewShipment(name, mode, weight, arrivalPort, departurePort);
	   }
	    
	   System.out.println("Shipment details are");
	   System.out.format("%-15s%-15s%-25s%-15s%-20s%s\n","Id","Shippername","Mode of transportation","Total weight","Arrival port","Departure port");
	
	   for(int i=0;i<shipmentList.length;i++) {
			System.out.println(shipmentList[i]);
		}
	}
}