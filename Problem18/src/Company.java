			
public class Company extends ShipmentEntity{
	
	private String identifier;
	private String iata;
	private String fmc;
	
	public Company(String name,String identificationNumber,String identifier,String iata,String fmc){
		this.shipmentEntityName = name;
		this.identificationNumber = identificationNumber;
		this.identifier = identifier;
		this.iata = iata;
		this.fmc = fmc;
	}
	
	public Company(){
		
	}
	
	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getIata() {
		return iata;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}

	public String getFmc() {
		return fmc;
	}

	public void setFmc(String fmc) {
		this.fmc = fmc;
	}

	public void display(){
		System.out.println(String.format("%-15s %-25s %-15s %-15s %-15s",this.shipmentEntityName, this.identificationNumber,
				this.identifier, this.iata, this.fmc));
	}
}