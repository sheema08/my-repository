import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// fill code
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of countries :");
		int country = sc.nextInt();
		
		System.out.println("Enter the total number of shipment per month :");
		int shipmentTotal = sc.nextInt();
		
		if(country > 150 && shipmentTotal > 1500)
			System.out.println("The company grade is : A");
		else if(country > 125 && shipmentTotal > 1200)
			System.out.println("The company grade is : B");
		else if(country > 100 && shipmentTotal > 1000)
			System.out.println("The company grade is : C");
		else if(country > 75 && shipmentTotal > 700)
			System.out.println("The company grade is : D");
		else if(country <= 75 && country >= 0 && shipmentTotal <= 700 && shipmentTotal >=0)
			System.out.println("The company grade is : E");
		else
			if(country < 0 && shipmentTotal < 0)
				System.out.println("Invalid Input");
	}

}
