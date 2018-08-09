import java.text.DecimalFormat;


public class CompanyShipment extends ShipmentEntity {
	private Integer tax;

	public CompanyShipment(String name, Double weight, Integer quantity, Double transferCost, Double maxShipmentCapacity,
			Integer tax) {
		//fill the code
		super(name, weight, quantity, transferCost, maxShipmentCapacity);
		this.tax = tax;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}
	
	public void calculateCost(){
		//fill the code
		DecimalFormat df = new DecimalFormat("#.0");
		double cost = weight*quantity*transferCost;
		double taxCalculated = (cost * tax)/100;
		double total = cost+taxCalculated;
		System.out.println("Cost for the shipment is "+df.format(total));
	}
	
	public void operatingCapacity(){
		//fill the code
		double currentCapacity = quantity*weight;
		if(currentCapacity < maxShipmentCapacity)
			System.out.println("The shipment is within the shipping capacity of the company");
		else
			System.out.println("The shipment is not within the shipping capacity of the company");
	}
}
