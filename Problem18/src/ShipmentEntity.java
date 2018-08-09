			
public class ShipmentEntity {
	
	protected String shipmentEntityName;
	protected String identificationNumber;
	
	public ShipmentEntity(String shipmentEntityName,String identificationNumber){
		this.identificationNumber = identificationNumber;
		this.shipmentEntityName = shipmentEntityName;
	}
	public ShipmentEntity(){
		
	}
	
	public String getShipmentEntityName() {
		return shipmentEntityName;
	}
	public void setShipmentEntityName(String shipmentEntityName) {
		this.shipmentEntityName = shipmentEntityName;
	}
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	
	public void display(){
		System.out.println("");
	}
}