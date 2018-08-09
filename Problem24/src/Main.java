import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				// fill code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the container price :");
        int price = sc.nextInt();
        
        System.out.println("Enter the number of items in the container :");
        int totalItem = sc.nextInt();
        int avg = 0;
        try{
        	avg = price / totalItem;
        	System.out.println("The average price of the item is Rs."+avg);
        }catch(ArithmeticException e){
        	System.out.println("Exception : java.lang.ArithmeticException");
        } catch(Exception e){
        	System.out.println("Exception : java.lang.Exception");
        }
	}

}

