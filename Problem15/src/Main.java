import java.util.Scanner;

public class Main {
   public static void main(String[] args){
	//fill the code
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number of cargo");
	   int cargoNo = sc.nextInt();
	   
	   System.out.println("Enter the cargo id");
	   int[] cargoIds = new int[cargoNo];
	   for(int i=0;i<cargoNo;i++){
		   cargoIds[i] = sc.nextInt();
	   }
	   
	   System.out.println("Enter the number of shipment");
	   int shipmentCount = sc.nextInt();
	   
	   System.out.println("Enter the shipment name");
	   String[] shipmentNames = new String[shipmentCount];
	   String temp = "";
	   for(int i=0;i<shipmentCount;i++){
		   temp = sc.nextLine();
		   
		   if(temp.isEmpty()){
			   System.out.print("");
			   i--;
		   } else {
			   shipmentNames[i] = temp;
		   }
	   } 
	   
	   System.out.println("Enter the cargo id");
	   int cargoId = sc.nextInt();
	   
	   int pos = -1;
	   boolean found = false;
	   for(int i=0;i<cargoNo;i++){
		   if(cargoIds[i] == cargoId){
			   pos = i;
			   found = true;
		   }
	   }
	   
	   if(found && (cargoNo == shipmentCount || cargoNo < shipmentCount)){
		   System.out.println(shipmentNames[pos]);
	   } else {
		   System.out.println("Yet to be shipped");
	   }
	   
   }
}