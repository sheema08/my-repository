
public class ContainerShip extends WaterCarrier{
	Integer noOfContainers;

	public ContainerShip(){
		
	}
	
	public ContainerShip(String carrierName, String carrierCode, String iataCode, String carrierAddress,
			String carrierType, Integer noOfContainers) {
		super(carrierName, carrierCode, iataCode, carrierAddress, carrierType);
		this.noOfContainers = noOfContainers;
	}

	public Integer getNoOfContainers() {
		return noOfContainers;
	}

	public void setNoOfContainers(Integer noOfContainers) {
		this.noOfContainers = noOfContainers;
	}

	//fill the code
	public void displayShipDetails(){
		System.out.println(String.format("%-20s%-15s%-15s%-15s%-15s%-25s  %s",this.carrierType, this.carrierName, this.carrierCode, this.iataCode, this.carrierAddress, (this.noOfContainers + " containers"), "Company" ));
	}
}
