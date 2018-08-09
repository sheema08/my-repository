			
public class Customer extends ShipmentEntity{
	
	private Integer id;
	private String name;
	
	public Customer(String shipmentEntityName,String identificationNumber,Integer id,String name){
		this.identificationNumber = identificationNumber;
		this.shipmentEntityName = shipmentEntityName;
		this.id = id;
		this.name = name;
	}
	
	public Customer(){
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display(){
		System.out.println(String.format("%-15s %-25s %-15s %-15s",this.shipmentEntityName, this.identificationNumber,
					this.id, this.name));
	}
}