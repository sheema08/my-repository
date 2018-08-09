import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class ShipmentBO {
	public List<Commodity> readCommodity(String fileName) throws Exception{
		
		List<Commodity> commodityList = new ArrayList<Commodity>();
		
		File file = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));
		 
		String st;
		Commodity commodity = null;
		String[] temp = new String[5];
		Boolean hazardous = false;
		while ((st = br.readLine()) != null){
			temp = st.split(",");
			
			if("1".equals(temp[3]))
				hazardous = true;
			
			commodity = new Commodity(Long.parseLong(temp[0]), Double.parseDouble(temp[1]), Integer.parseInt(temp[2]), hazardous, Long.parseLong(temp[4]));
		    commodityList.add(commodity);
		}
		return commodityList;
	}
	
	public void checkCommodity(List<Commodity> commodityList) {
		Commodity commodity = null;
		double totalWeight = 0.0;
		int totalQuantity = 0;
		boolean isFound = false; 
		for(int i=0;i<commodityList.size();i++){
			commodity = commodityList.get(i);
			totalWeight += commodity.getWeight();
			totalQuantity += commodity.getQuantity();
			if(commodity.getHazardous()){
				isFound = true;
			}
		}
		System.out.println("Total Weight: "+totalWeight);
		System.out.println("Total Quantity: "+totalQuantity);
		if(isFound)
			System.out.println("Hazardous Commodity Found!");
	}
}
