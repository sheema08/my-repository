import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws Exception {
        String name,source,destination;
        double price;
        int choice;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the shipment name :");
        name = br.readLine();
        System.out.println("Enter the source :");
        source = br.readLine();
        System.out.println("Enter the destination :");
        destination = br.readLine();
        System.out.println("Enter the price :");
        price =Double.parseDouble(br.readLine());
        System.out.println("1. Agent\n2. Company\nEnter your choice :");
        choice = Integer.parseInt(br.readLine());
        Shipment shipment;
        DecimalFormat df = new DecimalFormat("#.00");
        
        if(choice == 1)
        {
            double referalFee;
            System.out.println("Enter the referal fee :");
            referalFee = Double.parseDouble(br.readLine());
            System.out.println("Agent details :");
			//fill code here.
            AgentShipment agent = new AgentShipment(name, source, destination, price, referalFee);
            System.out.format("%-15s %-15s %-15s %s\n","Name","Source","Destination","Total Amount");
			//fill code here.
            System.out.println(String.format("%-15s %-15s %-15s%s",agent.getName(), agent.getSource(), agent.getDestination(), df.format(agent.calculateShipmentAmount())));
        }
        else if(choice == 2)
        {
            double luxuryTax,corporateTax;
            System.out.println("Enter the luxury tax and corporate tax:");
            luxuryTax = Double.parseDouble(br.readLine());
            corporateTax = Double.parseDouble(br.readLine());
            System.out.println("Company details :");
			//fill code here.
            CompanyShipment company = new CompanyShipment(name, source, destination, price, luxuryTax, corporateTax);
            System.out.format("%-15s %-15s %-15s %s\n","Name","Source","Destination","Total Amount");
			//fill code here.
            System.out.println(String.format("%-15s %-15s %-15s%s",company.getName(), company.getSource(), company.getDestination(), df.format(company.calculateShipmentAmount())));
        }
    }
    
}
