public abstract class ShipmentEntity {
	protected String name;
	protected Double weight;
	protected Integer quantity;
	protected Double transferCost;
	protected Double maxShipmentCapacity;
	
	
	public ShipmentEntity(String name, Double weight, Integer quantity, Double transferCost,
			Double maxShipmentCapacity) {
		this.name = name;
		this.weight = weight;
		this.quantity = quantity;
		this.transferCost = transferCost;
		this.maxShipmentCapacity = maxShipmentCapacity;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getWeight() {
		return weight;
	}
	
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Double getTransferCost() {
		return transferCost;
	}
	
	public void setTransferCost(Double transferCost) {
		this.transferCost = transferCost;
	}
	
	public Double getMaxShipmentCapacity() {
		return maxShipmentCapacity;
	}
	
	public void setMaxShipmentCapacity(Double maxShipmentCapacity) {
		this.maxShipmentCapacity = maxShipmentCapacity;
	}
	
	//fill the code
	public abstract void calculateCost();
	
	public abstract void operatingCapacity();
}
