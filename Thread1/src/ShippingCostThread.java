import java.util.ArrayList;
import java.util.List;

public class ShippingCostThread extends Thread  {

    List<Cargo> cargoList = new ArrayList<Cargo>();
	List<Double> priceList = new ArrayList<Double>();
    
    public void run() {
        
       //fill in your code here
    	Cargo cargo = null;
    	double price = 0.0;
    	for(int i=0;i<cargoList.size();i++){
    		cargo = cargoList.get(i);    		
            if("DRY".equalsIgnoreCase(cargo.getStorageType()))
            	price = cargo.getWeight()*0.90;
            else
            	price = cargo.getWeight()*1.85;		
            getPriceList().add(price);
    	} 
    }
    
    public List<Cargo> getCargoList() {
        return cargoList;
    }

    public void setCargoList(List<Cargo> cargoList) {
        this.cargoList = cargoList;
    }


    public List<Double> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<Double> priceList) {
        this.priceList = priceList;
    }
    
}
