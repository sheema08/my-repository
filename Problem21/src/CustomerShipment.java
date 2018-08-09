import java.text.DecimalFormat;


public class CustomerShipment extends ShipmentEntity{
	private Double referalFee;

	
	public CustomerShipment(String name, Double weight, Integer quantity, Double transferCost,
			Double maxShipmentCapacity, Double referalFee) {
		//fill the code
		super(name, weight, quantity, transferCost, maxShipmentCapacity);
		this.referalFee = referalFee;	
	}

	public Double getReferalFee() {
		return referalFee;
	}

	public void setReferalFee(Double referalFee) {
		this.referalFee = referalFee;
	}

	public void calculateCost(){
		//fill the code
		DecimalFormat df = new DecimalFormat("#.0");
		double total = (weight*quantity*transferCost)+referalFee;
		System.out.println("Cost for the shipment is "+df.format(total));
	}
	
	public void operatingCapacity(){
		//fill the code
		double currentCapacity = quantity*weight;
		if(currentCapacity < maxShipmentCapacity)
			System.out.println("The shipment is within the shipping capacity of the agent");
		else
			System.out.println("The shipment is not within the shipping capacity of the agent");
	}
}