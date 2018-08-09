import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				// fill code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the total number of items");
        int count = sc.nextInt();
        int total = 0;
        int cost = 0;
        
	        for(int i=0;i<count;i++){
	        	 System.out.println("Enter the shipping price of the item "+(i+1));
	        	 try{
	        		 cost = Integer.parseInt(sc.next());
	        	 }catch(NumberFormatException e){
	             	System.out.println("Exception : java.lang.NumberFormatException");
	             	System.out.println("Re-enter the item price :");
	             	 cost = Integer.parseInt(sc.next());
	             } catch(Exception e){
	             	System.out.println("Exception : java.lang.Exception");
	             }	             	             
	             total = total + cost;
	        }
	        System.out.println("Total cost of the container is "+total);
        
	}

}

