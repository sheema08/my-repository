

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String args[]) throws IOException, InterruptedException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Cargo:");
        int numberOfCargo = Integer.parseInt(reader.readLine());
        
        System.out.println("Enter cargo details (id,length,width,weight,cargo type,storage type):");
        List<Cargo> cargoList = new ArrayList<Cargo>();
        for(int i=0;i<numberOfCargo;i++) {
            cargoList.add(new Cargo(reader.readLine()));
        }
        
       //fill in your code here
       
        List<Cargo> list1 = new ArrayList<Cargo>();
        List<Cargo> list2 = new ArrayList<Cargo>();
        Cargo cargo = null;
        int index = 0;
        if(cargoList.size()%2 ==0)
            index = cargoList.size()/2;
        else
        	index = (cargoList.size()/2 )+1;
        
        list1 = cargoList.subList(0, index);
        list2 = cargoList.subList(index, cargoList.size());
        
        System.out.println("Price List:");
        
        ShippingCostThread obj1 = new ShippingCostThread();
        obj1.setCargoList(list1);
        obj1.start();
        obj1.join();
        
        ShippingCostThread obj2 = new ShippingCostThread();
        obj2.setCargoList(list2);
        obj2.start();
        obj2.join();
        
        displayPrice(obj1.getPriceList());
        displayPrice(obj2.getPriceList());
    }
    
    public static void displayPrice(List<Double> list) {
        //fill in your code
    	for(int i=0;i<list.size();i++){
    		System.out.println(list.get(i));
    	}
    }
}
