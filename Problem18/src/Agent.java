			
public class Agent extends ShipmentEntity{
	
	private String name;
	private String iata;
	private String fmc;
	
	public Agent(String shipmentEntityName,String identificationNumber,String name,String iata,String fmc){
		this.shipmentEntityName = shipmentEntityName;
		this.identificationNumber = identificationNumber;
		this.name = name;
		this.iata = iata;
		this.fmc = fmc;
	}
	
	public Agent(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
				this.name, this.iata, this.fmc));
	}
}