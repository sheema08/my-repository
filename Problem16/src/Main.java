import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
   public static void main(String[] args){
	//fill the code
	   Scanner sc = new Scanner(System.in);
	   DecimalFormat df = new DecimalFormat("#.00");
	   
	   System.out.println("Enter the details of items in invoice");
	   System.out.println("Enter the number of items");
	   int count = sc.nextInt();
	   
	   double total = 0.0;
	   String item = "";
	   int itemCount = 0;
	   double itemCost = 0.0;
	   for(int i=0;i<count;i++){
		   System.out.println("Enter the item "+(i+1) +" details :");
		   item = sc.nextLine();
		   if(sc.nextLine().isEmpty())
			   System.out.print("");
		   itemCount = sc.nextInt();
		   if(sc.nextLine().isEmpty())
			   System.out.print("");
		   itemCost = sc.nextDouble();
		   total = total + (itemCount*itemCost);
	   }
	   System.out.println("Invoice Total : "+df.format(total));
   }
}