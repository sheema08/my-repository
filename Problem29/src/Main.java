import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// fill your code
		System.out.println("Enter the number of port details");
		int noOfPorts = Integer.parseInt(br.readLine());

		System.out.println("Enter the port details");
		String[] temp = new String[3];
		List<Port> portList = new ArrayList<Port>();
		Port port = null;
		for (int i = 0; i < noOfPorts; i++) {
			temp = br.readLine().split(",");
			port = new Port(new Integer(Integer.parseInt(temp[0])), temp[1], temp[2]);
			portList.add(port);
		}

		System.out.println(String.format("%-15s %-15s %-15s",
				"Port Id", "Name", "Location"));
		for (int i = 0; i < noOfPorts; i++) {
			System.out.println(portList.get(i));
		}
		
		System.out.println("Enter the position");
		int index = Integer.parseInt(br.readLine())-1;
		
		System.out.println("Enter port detail to be inserted");
		temp = br.readLine().split(",");
		port = new Port(Integer.parseInt(temp[0]), temp[1], temp[2]);
		portList.add(index, port);
		noOfPorts++;
		
		System.out.println("After the insertion of port details");
		
		System.out.println(String.format("%-15s %-15s %-15s",
				"Port Id", "Name", "Location"));
		for (int i = 0; i < noOfPorts; i++) {
			System.out.println(portList.get(i));
		}
	}
}
