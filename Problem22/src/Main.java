import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        int choice,noOfPerson,noOfDays;
        Boolean roomBoolean = false;
        String roomChoice;
        String lengthBreadth;
        int size=0;
        Double totalCost;
        Double totalAmount = 0d;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Room booking:");
        System.out.println("1. Single room\n2. Double room\n3. Deluxe Room\nEnter your choice:");
        //fill code here.
        choice = Integer.parseInt(br.readLine());
        System.out.println("Enter the number of person:");
        //fill code here.
        noOfPerson = Integer.parseInt(br.readLine());
        System.out.println("Enter the number of days:");
        //fill code here.
        noOfDays = Integer.parseInt(br.readLine());
        System.out.println("Enter the length x breadth:");
        //fill code here.
        lengthBreadth = br.readLine();
        String temp[] = lengthBreadth.split("x");
        Double tax = 0.0;
        switch(choice)
        {
            case 1:
                System.out.println("Do you want AC or not (y/n):");
                roomChoice = (br.readLine());
                //fill code here.               
                SingleRoom singleRoom = new SingleRoom(new Double(600.0), new Integer(Integer.parseInt(temp[0])), new Integer(Integer.parseInt(temp[1])));
                singleRoom.setRoomChoice(roomChoice);
                totalCost = singleRoom.calculateTotalCost(noOfPerson, noOfDays);
                
                
	       		 if("y".equalsIgnoreCase(roomChoice)){
	       			 tax = (totalCost * 8.9)/100;
	       			 totalAmount = totalCost + tax;
	       		 } else {
	       			 tax = (totalCost * 5.8)/100;
	       			totalAmount = totalCost + tax;
	       		 }		 
	       		size = singleRoom.calculateArea();
                break;
            case 2:
                System.out.println("Do you want extra cot (y/n):");
                roomChoice = (br.readLine());               
                DoubleRoom doubleRoom = new DoubleRoom(new Double(1000.0), new Integer(Integer.parseInt(temp[0])), new Integer(Integer.parseInt(temp[1])));
                doubleRoom.setRoomChoice(roomChoice);
                
                totalCost = doubleRoom.calculateTotalCost(noOfPerson, noOfDays);
                
       		 if("y".equalsIgnoreCase(roomChoice)){
       			 tax = (totalCost * 6.4)/100;
       			 totalAmount = totalCost + tax;
       		 } else {
       			 tax = (totalCost * 3.5)/100;
       			 totalAmount = totalCost + tax;
       		 }		 
       		size = doubleRoom.calculateArea();
                //fill code here.
                break;
            case 3:
                System.out.println("Do you want complementary breakfast (y/n):");
                roomChoice = br.readLine();
                //fill code here.
                DeluxeRoom deluxeRoom = new DeluxeRoom(new Double(1500.0), new Integer(Integer.parseInt(temp[0])), new Integer(Integer.parseInt(temp[1])));
                deluxeRoom.setRoomChoice(roomChoice);
                
                totalCost = deluxeRoom.calculateTotalCost(noOfPerson, noOfDays);

	       		 if("y".equalsIgnoreCase(roomChoice)){
	       			 tax = (totalCost * 7.3)/100;
	       			totalAmount = totalCost + tax;
	       		 } else {
	       			 tax = (totalCost * 4.9)/100;
	       			totalAmount = totalCost + tax;
	       		 }		 
	       		size = deluxeRoom.calculateArea();
                break;
        }
        System.out.println("The total Amount is:"+totalAmount);
        System.out.println("The total area is:"+size+"sq.ft");
    }
    
}
