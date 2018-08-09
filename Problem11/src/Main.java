import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException {
		Cargo cargo = new Cargo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cargo details:");
		
		System.out.println("Enter the name");
		cargo.setName(sc.nextLine());
		
		System.out.println("Enter the description");
		cargo.setDescription(sc.nextLine());
		
		System.out.println("Enter the length");
		cargo.setLength(sc.nextDouble());
		
		System.out.println("Enter the width");
		cargo.setWidth(sc.nextDouble());
		
		System.out.println("The cargo details are:");
		cargo.displayCargoDetails();
	}
}