import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter the number of shipment entity");
    	int count = sc.nextInt();
    	
    	int choice = 0;
    	
    	List<Customer> customers = new ArrayList<Customer>();
    	List<Company> companies = new ArrayList<Company>();
    	List<Agent> agents = new ArrayList<Agent>();
    	List<Carrier> carriers = new ArrayList<Carrier>();
    	
    	String temp[] = new String[10];
    	 for(int i = 0;i < count;i++){
  		   System.out.println("Enter the shipment entity "+(i+1) +" details :");
  		   System.out.println("Select the shipment entity type");
  		   System.out.println("1)Customer\n2)Company\n3)Agent\n4)Carrier");
  		   choice = sc.nextInt();
  		   
  		   if(sc.nextLine().isEmpty())
			   System.out.print("");
  		   
  		   temp = sc.nextLine().split(",");
  		   
  		   if(1 == choice){
  			   customers.add(new Customer(temp[0], temp[1], Integer.parseInt(temp[2]), temp[3]));
  		   } else if(2 == choice){
  			 companies.add(new Company(temp[0], temp[1], temp[2], temp[3], temp[4]));
  		   } else if(3 == choice){
  			 agents.add(new Agent(temp[0], temp[1], temp[2], temp[3], temp[4]));
  		   } else if(4 == choice){
  			 carriers.add(new Carrier(temp[0], temp[1], temp[2], temp[3]));
  		   }
    	 }
    	 
    	 System.out.println("Shipment details are");
    	 System.out.println("Enter the shipment entity type to display");
    	 String selection = sc.next();
    	 
    	 if("customer".equalsIgnoreCase(selection)){
    		 System.out.format("%-15s %-25s %-15s %-15s\n","Name","Identification Number","Customer Id","Customer Name");
    		 for(int i=0;i<customers.size();i++){
    			 customers.get(i).display();
    		 }    		 
    	 } else if("company".equalsIgnoreCase(selection)){
    		 System.out.format("%-15s %-25s %-15s %-15s %-15s\n","Name","Identification Number","Company Name","IATA","FMC");
    		 for(int i=0;i<customers.size();i++){
    			 companies.get(i).display();
    		 }  
    	 } else if("agent".equalsIgnoreCase(selection)){
    		 System.out.format("%-15s %-25s %-15s %-15s %-15s\n","Name","Identification Number ","Agent Name","IATA","FMC");
    		 for(int i=0;i<customers.size();i++){
    			 agents.get(i).display();
    		 }  
    	 } else if("carrier".equalsIgnoreCase(selection)){
    		 System.out.format("%-15s %-25s %-15s %-15s\n","Name","Identification Number","Code Name","IATA");
    		 for(int i=0;i<customers.size();i++){
    			 carriers.get(i).display();
    		 }  
    	 }
    }
}