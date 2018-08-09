import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	
        System.out.println("Enter user name :");
        // fill code here.
        String userName = br.readLine();
        System.out.println("Enter password :");
        // fill code here.
        String password = br.readLine();
        System.out.println("Enter address :");
        // fill code here.
        String address = br.readLine();
        
		// fill code here.
        User user = new User(userName, password, address);
        
        try{
        	new UserBO().validatePassword(user);
        	System.out.println("Password is strong");
        }catch(WeakPasswordException e){
        	System.out.println(e);
        }
    }
}