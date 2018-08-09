import java.util.Scanner;


public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the generated booking id");
		
		String id = sc.nextLine();
		String regex = "\\d+";
		
		if(id.matches(regex))
			System.out.println("Generated booking id is valid");
		else
			System.out.println("Generated booking id is not valid");
	}

}
