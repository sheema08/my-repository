import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
		// fill code here
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] purchaseRange = new int[count];
		int purchaseValue = 0;
		boolean valid = true;
		for(int i=0;i < count;i++){
			purchaseValue = sc.nextInt();
			if(purchaseValue < 0 || purchaseValue > 1000){
				System.out.println("Invalid Input");
				valid = false;
				break;
			} else {
				purchaseRange[i] = purchaseValue;
			}
		}
		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 0;
		int temp4 = 0;
		int temp5 = 0;
		if(valid){
			for(int i=0;i<count;i++){
				purchaseValue = purchaseRange[i];
				if(purchaseValue > 0 && purchaseValue <= 25){
					temp1++;
				} else if(purchaseValue > 25 && purchaseValue <= 50){
					temp2++;
				} else if(purchaseValue > 50 && purchaseValue <= 100){
					temp3++;
				} else if(purchaseValue > 100 && purchaseValue <= 500){
					temp4++;
				} else {
					if(purchaseValue > 500 && purchaseValue <= 1000)
						temp5++;
				} 
			}
			System.out.println("The number of items between 0 to 25 :"+temp1);
			System.out.println("The number of items between 25 to 50 :"+temp2);
			System.out.println("The number of items between 50 to 100 :"+temp3);
			System.out.println("The number of items between 100 to 500 :"+temp4);
			System.out.println("The number of items between 500 to 1000 :"+temp5);
		}
	}
}
