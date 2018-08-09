import java.text.DecimalFormat;

public class Shipment {
    private int id;
	private String shipperName;
	private String modeOfTransportation;
	private double totalWeight;
	private String arrivalPort;
	private String departurePort;
	private static int nextShipmentId = 1000;
	
	public Shipment(int id,String shipperName, String modeOfTransportation, double totalWeight, String arrivalPort, String departurePort){
		this.id = id;
		this.shipperName = shipperName;
		this.modeOfTransportation = modeOfTransportation;
		this.totalWeight = totalWeight;
		this.arrivalPort = arrivalPort;
		this.departurePort = departurePort;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShipperName() {
		return shipperName;
	}

	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}

	public String getModeOfTransportation() {
		return modeOfTransportation;
	}

	public void setModeOfTransportation(String modeOfTransportation) {
		this.modeOfTransportation = modeOfTransportation;
	}

	public double getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(double totalWeight) {
		this.totalWeight = totalWeight;
	}

	public String getArrivalPort() {
		return arrivalPort;
	}

	public void setArrivalPort(String arrivalPort) {
		this.arrivalPort = arrivalPort;
	}

	public String getDeparturePort() {
		return departurePort;
	}

	public void setDeparturePort(String departurePort) {
		this.departurePort = departurePort;
	}

	public static int getNextShipmentId() {
		return nextShipmentId;
	}

	public static void setNextShipmentId(int nextShipmentId) {
		Shipment.nextShipmentId = nextShipmentId;
	}

	public static Shipment createNewShipment(String shipperName,String modeOfTransportation,double totalWeight,String arrivalPort,String departurePort){
		Shipment shipment = new Shipment(++nextShipmentId, shipperName, modeOfTransportation, totalWeight, arrivalPort, departurePort);
		return shipment;
	}
	
	public String toString(){
		DecimalFormat df = new DecimalFormat("#.#");
		return String.format("%-15d%-15s%-25s%-15s%-20s%s",this.id,this.shipperName,this.modeOfTransportation,df.format(this.totalWeight)+"Kg",this.arrivalPort,this.departurePort) ;
	}
}