import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of ports");
		int noOfPorts = sc.nextInt();
		Port[] portList = new Port[noOfPorts];
		
		int id = 0;
		String name = "";
		String country = "India";
		String isSameCountry = "";
	    for(int i = 0;i < noOfPorts;i++){
		   System.out.println("Enter the port"+(i+1) +" details");
		   id = sc.nextInt();
		   
		   if(sc.nextLine().isEmpty())
			   System.out.print("");
		   
		   name = sc.nextLine();
		   
		   System.out.println("Is the port from same country[Y/N]");
		   isSameCountry = sc.next();
		   
		   if(null == isSameCountry || "N".equalsIgnoreCase(isSameCountry)){
			   if(sc.nextLine().isEmpty())
				   System.out.print("");
			   
			   System.out.println("Enter the country");
			   country = sc.nextLine();
		   } else {
			   country = "India";
		   }
		   
		   portList[i] = new Port(id, name, country);
	   }
	    
	   System.out.println("The port details are");
	   System.out.format("%-15s %-15s %-15s\n","Id","Name","Country");
	
	   for(int i=0;i<portList.length;i++) {
			System.out.println(portList[i]);
		}
	}
}