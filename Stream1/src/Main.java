import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception{
		
		File file = new File("input.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		 
		  String st;
		  List<User> userList = new ArrayList<User>();
		  User user = null;
		  Long id = 0l;
		  String firstName = "";
		  String lastName = "";
		  String userName = "";
		  String password = "";
		  String mobileNumber = "";
		  while ((st = br.readLine()) != null){
			id = Long.parseLong(st.substring(0,5));
			firstName = st.substring(5, 15);
			lastName = st.substring(15, 25);
			userName = st.substring(25,35);
			password = st.substring(35, 43);
			mobileNumber = st.substring(43);
		    user = new User(id, firstName, lastName, userName, password, mobileNumber);
		    userList.add(user);
		  }
		  
		  System.out.format("%-10s %-15s %-15s %-15s %-15s %s\n", "id", "First Name", "Last Name","Username","Password", "Mobile Number");
		  
		  for(int i=0;i<userList.size();i++){
			  System.out.println(userList.get(i));
		  }  
		  
	}
}
