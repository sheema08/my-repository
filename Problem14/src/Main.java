import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
		// fill code here
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] customerIDs = new int[count];

		for(int i=0;i < count;i++){
			customerIDs[i] = sc.nextInt();
		}
		int temp1 = 0;
		
		for(int i=0;i<count;i++){
			if((i+1) != customerIDs[i]){
				temp1 = i+1;
				break;
			}
		}
		
		System.out.println("Customer id "+(temp1)+" is missing");
	}
}
