
public class BulkShip extends WaterCarrier{
	Integer noOfcargoes;

	public BulkShip(){
		
	}
	
	public BulkShip(String carrierName, String carrierCode, String iataCode, String carrierAddress, String carrierType,
			Integer noOfcargoes) {
		super(carrierName, carrierCode, iataCode, carrierAddress, carrierType);
		this.noOfcargoes = noOfcargoes;
	}

	public Integer getNoOfcargoes() {
		return noOfcargoes;
	}

	public void setNoOfcargoes(Integer noOfcargoes) {
		this.noOfcargoes = noOfcargoes;
	}

	//fill the code
	public void displayShipDetails(){
		System.out.println(String.format("%-20s%-15s%-15s%-15s%-15s%-25s  %s",this.carrierType, this.carrierName, this.carrierCode, this.iataCode, this.carrierAddress, (this.noOfcargoes + " cargoes"), "Company" ));
	}
}
