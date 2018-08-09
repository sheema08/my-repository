import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ShipmentEntity shipmentEntity = null;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1. Customer Shipment\n2. Company Shipment\nEnter your choice :");
		Integer choice = Integer.parseInt(buf.readLine());
		if(choice <= 2){
			System.out.println("Enter the name :");
			String name = buf.readLine();
			System.out.println("Enter the weight :");
			Double weight = Double.parseDouble(buf.readLine());
			System.out.println("Enter the quantity :");
			Integer quantity = Integer.parseInt(buf.readLine());
			System.out.println("Enter the shipment transfer cost :");
			Double transferCost = Double.parseDouble(buf.readLine());
			System.out.println("Enter the maximum shipment capacity :");
			Double maxShipmentCapacity = Double.parseDouble(buf.readLine());
			Double referalFee = 0.0;
			Integer tax = 0;
			ShipmentEntity shipment = null;
			switch(choice) {
				case 1:System.out.println("Enter the referal fee :");
					   //fill the code
					referalFee = Double.parseDouble(buf.readLine());
					shipment = new CustomerShipment(name, weight, quantity, transferCost, maxShipmentCapacity, referalFee);
					break;
				case 2:System.out.println("Enter the tax percentage:");
					   //fill the code
					tax = Integer.parseInt(buf.readLine());
					shipment = new CompanyShipment(name, weight, quantity, transferCost, maxShipmentCapacity, tax);
					break;				
			}
			   //fill the code
			shipment.calculateCost();
			shipment.operatingCapacity();
		}
		else{
			System.out.println("Invalid Input");
		}
	}

}