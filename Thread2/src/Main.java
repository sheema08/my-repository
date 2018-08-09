import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
    
    public static void main(String args[]) throws IOException, InterruptedException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Item> itemList = new ArrayList<Item>();
        
        itemList.add(new Item(1200L,"Moto G5 Plus","Paypal Digital Gifts",15000.0,3.5));
        itemList.add(new Item(1201L,"Moto M","deluxe-marken",15500.0,4.5));
        itemList.add(new Item(1202L,"Lenovo P2","Paypal Digital Gifts",22000.0,4.0));
        itemList.add(new Item(1203L,"Lenovo Vibe K5 Note","gohastings",25000.0,3.5));
        itemList.add(new Item(1204L,"Asus Zenfone 3","deluxe-marken",18000.0,3.0));
        itemList.add(new Item(1205L,"Lenovo Vibe K5 Note","kayfast1",23500.0,3.2));
        itemList.add(new Item(1206L,"Moto G5 Plus","deluxe-marken",16500.0,3.8));
        itemList.add(new Item(1207L,"Asus Zenfone 3","Paypal Digital Gifts",18500.0,4.6));
        itemList.add(new Item(1208L,"Lenovo Vibe K5 Note","Paypal Digital Gifts",24000.0,4.1));
        itemList.add(new Item(1209L,"Samsung Galaxy On5","deluxe-marken",16000.0,3.0));
        itemList.add(new Item(1210L,"Asus Zenfone 3","deluxe-marken",17500.0,3.2));
        itemList.add(new Item(1211L,"Lenovo P2","kayfast1",25000.0,3.4));
        itemList.add(new Item(1212L,"Moto M","kayfast1",15000.0,3.0));
        itemList.add(new Item(1213L,"Asus Zenfone 3","kayfast1",18000.0,3.5));
        itemList.add(new Item(1214L,"Moto G5 Plus","deluxe-marken",14000.0,3.0));
        
        List<String> itemNames = new ArrayList<String>();
        itemNames.add("Moto G5 Plus");
        itemNames.add("Moto M");
        itemNames.add("Lenovo P2");
        itemNames.add("Lenovo Vibe K5 Note");
        itemNames.add("Asus Zenfone 3");
        itemNames.add("Lenovo Vibe K5 Note");
        itemNames.add("Samsung Galaxy On5");
                
       //fill in your code here
        for(int i=0;i<itemNames.size();i++){
        	System.out.println((i+1)+" "+itemNames.get(i));
        }
        
        System.out.println("Enter all the items you want to purchase:");
        String[] items = reader.readLine().split(",");
       
        //fill in your code here
        int num = 0;
        SearchProviderThread obj = null;
        String itemName = "";
        for(int i=0;i<items.length;i++){
    	    num = Integer.parseInt(items[i]);
    	    num--;
    	    itemName = itemNames.get(num);
    	    System.out.println(itemName);
    	    obj = new SearchProviderThread(itemName, itemList);
    	    obj.start();
    	    obj.join();
    	    for(int j=0;j<obj.getFilteredItems().size();j++){
    	    	System.out.println(obj.getFilteredItems().get(j));
    	    }
        }
    }
}
