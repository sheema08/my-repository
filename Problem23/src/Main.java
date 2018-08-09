
import java.io.*;
public class Main {
   public static void main(String args[]) throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
        //fill your code
     
     System.out.println("Select the invoice type\n1)Sales invoice\n2)Service invoice");
     int choice = Integer.parseInt(br.readLine());
     int id;
     double amount;
     
     if(1 == choice){
    	 int vat, cst;
	     System.out.println("Enter the invoice id");
	     id = Integer.parseInt(br.readLine());
	     
	     System.out.println("Enter the amount");
	     amount = Double.parseDouble(br.readLine());
	     
	     System.out.println("Enter the vat tax percentage");
	     vat = Integer.parseInt(br.readLine());
	     
	     System.out.println("Enter the cst tax percentage");
	     cst = Integer.parseInt(br.readLine());
	     
	     SalesInvoice salesInvoice = new SalesInvoice(id, amount, vat, cst);
	     
	     salesInvoice.computeTax(amount);
     } else {
    	 if(2 == choice){
    		 int rentTaxPercentage, travelTaxPercentage;
    		 System.out.println("Enter the service type\n1)Air service\n2)Land service");
    		 String serviceType = br.readLine();
    		 
    		 System.out.println("Enter the invoice id");
    	     id = Integer.parseInt(br.readLine());
    	     
    	     System.out.println("Enter the amount");
    	     amount = Double.parseDouble(br.readLine());
    	     
    	     if("Land service".equalsIgnoreCase(serviceType)){
	    	     System.out.println("Enter the commercial tax percentage");
	    	     rentTaxPercentage = Integer.parseInt(br.readLine());
	    	     
	    	     LandService landService = new LandService(id, amount, serviceType, rentTaxPercentage);
	    	     landService.computeTax(amount);
    	     } else {
    	    	 System.out.println("Enter the federal excise tax percentage");
    	    	 travelTaxPercentage = Integer.parseInt(br.readLine());
    	    	 
    	    	 AirService airService = new AirService(id, amount, serviceType, travelTaxPercentage);
    	    	 airService.computeTax(amount);
    	     }
    	     
    	     
    	 }
     }
     
     
   }    
}
