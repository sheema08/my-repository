import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String args[])throws IOException{
		//fill the code
		Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter the number of carriers :");
    	int count = sc.nextInt();
    	
		List<WaterCarrier> carriers = new ArrayList<WaterCarrier>();
    	
    	String temp[] = new String[10];
    	 for(int i = 0;i < count;i++){
  		   System.out.println("Enter the carrier "+(i+1) +" details :");
  		  
  		   if(sc.nextLine().isEmpty())
			   System.out.print("");
  		 
  		   temp = sc.nextLine().split(",");
  		   
  		 if(sc.nextLine().isEmpty())
			   System.out.print("");
  		   carriers.add(WaterCarrier.createShip(temp[0], temp[1], temp[2], temp[3], temp[4], Integer.parseInt(temp[5])));
    	 }
		System.out.println("Ship details are");
		System.out.format("%-20s%-15s%-15s%-15s%-15s%-25s%s\n","Carrier type","Name","Code","IATAcode","Location","Capacity","OwnedBy");
		//fill the code
		BulkShip bulkShip = null;
		ContainerShip containerShip = null;
		Ferry ferry = null;
		 for(int i = 0;i < carriers.size();i++){
			 if("BulkShip".equalsIgnoreCase(carriers.get(i).getCarrierType())){
				 bulkShip = (BulkShip)carriers.get(i);
				 bulkShip.displayShipDetails();
			 } else if("ContainerShip".equalsIgnoreCase(carriers.get(i).getCarrierType())){
				 containerShip = (ContainerShip)carriers.get(i);
				 containerShip.displayShipDetails();
			 } else if("Ferry".equalsIgnoreCase(carriers.get(i).getCarrierType())){
				 ferry = (Ferry)carriers.get(i);
				 ferry.displayShipDetails();
			 }
		 }
	}
}
