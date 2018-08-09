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
		int temp1 = customerIDs[0];
		
		for(int i=1;i<count;i++){
			if(temp1 < customerIDs[i]){
				temp1 = customerIDs[i];
			}
		}
		
		System.out.println("Next customer id is "+(temp1+1));
	}
}
