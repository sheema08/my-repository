import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of shipment:");
        int n = Integer.parseInt(br.readLine());
        int i;
        //fill code here.
        String temp[] = new String[3];
        String shipmentDetails;
        List<Shipment> shipmentList = new ArrayList<Shipment>();
        Set<String> customer = new TreeSet<String>();
        Set<String> agent = new TreeSet<String>();
        
        for(i=0;i<n;i++)
        {
            System.out.println("Enter shipment "+(i+1)+" details:");
            shipmentDetails = br.readLine();
            //fill code here.
            temp = shipmentDetails.split(",");
            shipmentList.add(new Shipment(temp[0], temp[1], temp[2]));            
        }
        System.out.println("Shipment details:");
        System.out.format("%-15s %-15s %s\n","Shipment name","Customer name","Agent name");
       //fill code here.
        
        Shipment shipment = null;
        for(i=0;i<n;i++) {
        	shipment = shipmentList.get(i);
        	customer.add(shipment.getCustomerName());
        	agent.add(shipment.getAgentName());
            System.out.println(shipment);
        }
        
        System.out.println("Unique customer name:");
        Iterator ite = customer.iterator();
        while(ite.hasNext()){
        	System.out.println(ite.next());
        }
        
        System.out.println("Unique agent name:");
        ite = agent.iterator();
        while(ite.hasNext()){
        	System.out.println(ite.next());
        }
    }
    
}
