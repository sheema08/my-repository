
public class Shipment {
    
    private String shipmentName;
    private String agentName;
    private String customerName;

    public Shipment(String shipmentName, String customerName,String agentName) {
        this.agentName = agentName;
        this.customerName = customerName;
        this.shipmentName = shipmentName;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getShipmentName() {
        return shipmentName;
    }

    public void setShipmentName(String shipmentName) {
        this.shipmentName = shipmentName;
    }
    
    public String toString() {
		return String.format("%-15s %-15s %s", getShipmentName(), getCustomerName(), getAgentName());
	}
}
