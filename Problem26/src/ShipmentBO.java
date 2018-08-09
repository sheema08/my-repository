public class ShipmentBO {
	public Boolean validateShipment(String p1,String p2,Port[] ports) throws InvalidPortException {
		//fill the code	
		if(p1.equalsIgnoreCase(p2)){
			throw new InvalidPortException("The port name is invalid");
		}
		return true;
	}
	
	public void displayShipmentDetails(Shipment shipmentObj,Port[] ports,String p1,String p2){
		System.out.println("Shipment Details :");
		System.out.format("%-15s %-15s %-15s %-15s\n", "Shipment id","Shipment name","Arrival place","Departure place");
		Port port = null;
		for(int i=0;i<ports.length;i++){
			port = ports[i];
			if(p1.equalsIgnoreCase(port.getName()))
				shipmentObj.setArrivalport(port);
			if(p2.equalsIgnoreCase(port.getName()))
				shipmentObj.setDepartureport(port);
		}
		System.out.println(String.format("%-15s %-15s %-15s %-15s", shipmentObj.getId(), shipmentObj.getName(), 
						shipmentObj.getArrivalport().getName()+"/"+shipmentObj.getArrivalport().getCountry(), 
						shipmentObj.getDepartureport().getName()+"/"+shipmentObj.getDepartureport().getCountry()));
		
	}
}