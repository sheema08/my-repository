import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the email id");
		String email = sc.nextLine();
		
		int index = email.lastIndexOf(".")+1;
		String domain = email.substring(index);
		
		if("com".equals(domain) ||
				"biz".equals(domain) ||
				"net".equals(domain) ||
				"org".equals(domain)){
			System.out.println("Valid domain");
		} else
			System.out.println("Not a valid domain");
	}

}
