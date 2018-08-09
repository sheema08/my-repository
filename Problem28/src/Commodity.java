public class Commodity {

	private String commodityName;
	private String quantity;
	private String totalvalue;
	private String totalWeight;
	private String hazardous;

	public Commodity() {
	}

	public Commodity(String commodityName, String quantity, String totalvalue,
			String totalWeight, String hazardous) {
		super();
		this.commodityName = commodityName;
		this.quantity = quantity;
		this.totalvalue = totalvalue;
		this.totalWeight = totalWeight;
		if("true".equalsIgnoreCase(hazardous))
			this.hazardous = "Yes";
		else
			this.hazardous = "No";
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getTotalvalue() {
		return totalvalue;
	}

	public void setTotalvalue(String totalvalue) {
		this.totalvalue = totalvalue;
	}

	public String getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(String totalWeight) {
		this.totalWeight = totalWeight;
	}

	public String getHazardous() {
		return hazardous;
	}

	public void setHazardous(String hazardous) {
		if("true".equalsIgnoreCase(hazardous))
			this.hazardous = "Yes";
		else
			this.hazardous = "No";
	}

	public String toString() {

		// fill your code
		return String.format("%-15s%-15s%-15s%-15s%s", this.commodityName, this.quantity, this.totalvalue, this.totalWeight, this.hazardous);
	}
}
