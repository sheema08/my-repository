
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {

          //fill your code
          try{
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter the total number of users");
             int userCount = Integer.parseInt(br.readLine());
             
             User userArray[] = new User[userCount];
             int i = 0;
             
             System.out.println("Enter user details");
             
             while(i<userCount){
            	 String[] temp = br.readLine().split(",");
            	 while(temp != null){
            		 userArray[i] = new User(temp[0], temp[1], temp[2], temp[3]);
            		 temp = null;
            	 }
            	 i++;
             }
             System.out.println("1)Search user by user name\n2)Search user by first name and last name\nEnter your option");
             int choice = Integer.parseInt(br.readLine());
             
             User user = null;
             
             if(choice == 1){
                System.out.println("Enter the user name to search");
                String userName = br.readLine();
                user = new User().findUser(userArray, userName);
             }
             
             if(choice == 2){
                System.out.println("Enter the first name to search");
                String firstName = br.readLine();
                
                System.out.println("Enter the last name to search");
                String lastName = br.readLine();
                
                user = new User().findUser(userArray, firstName, lastName);
             }
             
             if(user != null){
                System.out.println("User details :");
                System.out.println("Username :"+user.getUserName());
                System.out.println("FirstName :"+user.getFirstName());
                System.out.println("LastName :"+user.getLastName());
                System.out.println("Contact :"+user.getContact());
             } else {
                System.out.println("User not found");
             }
             
          } catch(Exception e){
              System.out.println("Exception caught"+e.getMessage());
          }
    }
    
}
