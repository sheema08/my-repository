import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
		// fill code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of months :");
		int months = sc.nextInt();
		
		if(months > 0){		
			System.out.println("Enter the profit of each month in shipment");
			int profit = 0;
			
			for(int i=0;i < months;i++){
				profit = profit + sc.nextInt();
			}
			System.out.println("Total profit : "+profit);
		} else {
			System.out.println("Invalid Input");
		}
	}

}
