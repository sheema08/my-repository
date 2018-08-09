  import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[])throws IOException{
		
 		// fill your code
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	
    	System.out.println("Enter the number of commodities:");
    	int count = Integer.parseInt(br.readLine());
    	
    	System.out.println("Enter the commodity details");
    	String[] temp = new String[5];
    	List<Commodity> commodityList = new ArrayList<Commodity>();
    	Commodity commodity = null;
    	for(int i=0;i<count;i++){
    		temp = br.readLine().split(",");
    		commodity = new Commodity(temp[0], temp[1], temp[2], temp[3], temp[4]);
    		commodityList.add(commodity);
    	}
    	
    	System.out.println("Commodity details are:");
    	System.out.println(String.format("%-15s%-15s%-15s%-15s%s", "Commodity Name", "Quantity", "Total Value", "TotalWeight", "Hazardous"));
    	
    	for(int i=0;i<count;i++){
    		System.out.println(commodityList.get(i));
    	}
	}
}
