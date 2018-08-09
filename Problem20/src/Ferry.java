
public class Ferry extends WaterCarrier{
	Integer maxLoad;

	public Ferry(){
		
	}
	
	public Ferry(String carrierName, String carrierCode, String iataCode, String carrierAddress, String carrierType,
			Integer maxLoad) {
		super(carrierName, carrierCode, iataCode, carrierAddress, carrierType);
		this.maxLoad = maxLoad;
	}

	public Integer getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(Integer maxLoad) {
		this.maxLoad = maxLoad;
	}

	//fill the code
	public void displayShipDetails(){
		System.out.println(String.format("%-20s%-15s%-15s%-15s%-15s%-25s  %s",this.carrierType, this.carrierName, this.carrierCode, this.iataCode, this.carrierAddress, (this.maxLoad + " kilograms"), "Agent" ));
	}
}
