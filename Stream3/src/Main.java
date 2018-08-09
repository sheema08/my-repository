import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<User> userList = new ArrayList<User>();
		User user = null;
		Long id = 0l;
		String firstName = "";
		String lastName = "";
		String userName = "";
		String password = "";
		String mobileNumber = "";
		Long roleId = 0l;
		String roleName = "";
		Role role = null;
		System.out.println("Enter the number of users:");
		int count = Integer.parseInt(br.readLine());
		System.out.println("Enter the user details:");
		for(int i=0;i<count;i++){
			System.out.println("Enter the User ID");
			id = Long.parseLong(br.readLine());
			System.out.println("Enter the first name");
			firstName = br.readLine();
			System.out.println("Enter the last name");
			lastName = br.readLine();
			System.out.println("Enter the username");
			userName = br.readLine();
			System.out.println("Enter the password");
			password = br.readLine();
			System.out.println("Enter the mobile number");
			mobileNumber = br.readLine();
			System.out.println("Enter the role name");
			roleName = br.readLine();
			
			if("Admin".equalsIgnoreCase(roleName))
				roleId = Long.parseLong("100");
			else if("Shipping Manager".equalsIgnoreCase(roleName))
				roleId = Long.parseLong("101");
			else if("Purchase Manager".equalsIgnoreCase(roleName))
				roleId = Long.parseLong("102");
			
			role = new Role(roleId, roleName);
			user = new User(id, firstName, lastName, userName, password,
					mobileNumber,role);
			userList.add(user);
		}
		new UserBO().saveAllUser(userList, "output.txt");
	}
}
