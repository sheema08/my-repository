import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// fill your code
		
		System.out.println("Enter the port details");
		String[] temp = new String[3];
		List<Port> portList = new ArrayList<Port>();
		Port port = null;
		String choice = "Yes";
		while("Yes".equalsIgnoreCase(choice)){	
			temp = br.readLine().split(",");
			port = new Port(new Integer(Integer.parseInt(temp[0])), temp[1], temp[2]);
			portList.add(port);
			
			System.out.println("Do you want to continue[Yes/No]");
			choice = br.readLine();
		}
		System.out.println("Port details in sorted order");
		Collections.sort(portList, new PortComparator());
		
		System.out.println(String.format("%-15s %-15s %-15s",
				"Port Id", "Name", "Country"));
		for (int i = 0; i < portList.size(); i++) {
			System.out.println(portList.get(i));
		}
	}
}
