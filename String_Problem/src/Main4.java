import java.util.Scanner;


public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the document 1 content:");
		String str1 = sc.nextLine().trim();
		
		System.out.println("Enter the document 2 content:");
		String str2 = sc.nextLine().trim();
		
		if(str1.equals(str2))
			System.out.println("Green");
		else if(str1.replaceAll("\\s+","").equals(str2.replaceAll("\\s+","")))
			System.out.println("Orange");
		else if(str1.equalsIgnoreCase(str2))
			System.out.println("Blue");
		else
			System.out.println("Red");
	}

}
