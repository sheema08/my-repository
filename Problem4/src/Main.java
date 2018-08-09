import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// fill code
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight");
		int weight = sc.nextInt();
		
		System.out.println("Enter the distance");
		int distance = sc.nextInt();
		
		if(weight < 100 || distance < 500)
			System.out.println("Datex shipping offers discount");
		else
			System.out.println("Datex shipping offers no discount");
	}

}
