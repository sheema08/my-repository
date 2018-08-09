import java.util.Scanner;

public class Main1 {
	public static void main(String args[]){
		
		// fill the code
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of username to be verified:");
		int count = sc.nextInt();
		
		System.out.println("Enter the usernames:");
		String temp = "";
		String[] names = new String[count];
		int j=1;
		for(int i=0;i<count;i++){
			names[i] = sc.next();	
		}
		
		for(int i=0;i<count;i++){
			temp = names[i];
			temp = temp.replaceAll("\\W+","").replaceAll("_", "");
			if("".equals(temp)){
				System.out.println("IV"+(1000+j));
				j++;
			} else {
				System.out.println(temp);
			}			
		}		
	}
}

