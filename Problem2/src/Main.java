import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of containers :");
		int n = Integer.parseInt(buff.readLine());
		
		Container[] container = new Container[n];
		
		for(int i=0;i<n;i++) {
			container[i] = new Container();
			System.out.println("Enter the container "+(i+1)+" details :");
			//fill the code
			String[] temp = buff.readLine().split(",");
			container[i].setContainerNumber(temp[0]);
			container[i].setLength(Float.parseFloat(temp[1]));
			container[i].setWidth(Float.parseFloat(temp[2]));
			container[i].setHeight(Float.parseFloat(temp[3]));			
			container[i].setWeight(Double.parseDouble(temp[4]));			
		}
		
		System.out.format("Container details are\n%-20s %-15s %-15s %-15s %s\n","Container Number","Length","Width","Height","Weight");		
		//fill the code
		for(int i=0;i<n;i++) {
			container[i].displayContainerDetails();
		}
	}
}