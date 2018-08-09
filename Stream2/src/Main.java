import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception{
		
		ShipmentBO shipmentBO = new ShipmentBO();
		List<Commodity> commodityList = new ArrayList<Commodity>();
		
		commodityList = shipmentBO.readCommodity("input.txt");
		
		shipmentBO.checkCommodity(commodityList);
		  
	}
}
