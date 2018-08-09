			
public class Carrier extends ShipmentEntity{
	
	private String carrierCode;
	private String iata;
	
	public Carrier(String name,String identificationNumber,String carrierCode,String iata){
		this.shipmentEntityName = name;
		this.identificationNumber = identificationNumber;
		this.carrierCode = carrierCode;
		this.iata = iata;
	}
	
	public Carrier(){
		
	}
	
	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public String getIata() {
		return iata;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}
	
	public void display(){
		System.out.println(String.format("%-15s %-25s %-15s %-15s",this.shipmentEntityName, this.identificationNumber,
				this.carrierCode, this.iata));
	}
}