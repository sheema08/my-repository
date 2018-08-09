import java.util.Scanner;


public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the file content:");
		
		String fileContent = sc.nextLine().trim();
		
		System.out.println("Enter the virus keyword:");
		String virus = sc.nextLine().trim();
		
		if(fileContent.contains(virus))
			System.out.println("Virus "+virus+" is present");
		else
			System.out.println("Virus "+virus+" is not present");
	}

}
