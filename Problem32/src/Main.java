import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Role> roleList = new ArrayList<Role>();
		
		roleList.add(new Role(111, "Managing Director"));
		roleList.add(new Role(112, "Manager"));
		roleList.add(new Role(113, "Accountant"));
		roleList.add(new Role(114, "Receptionist"));
		
		System.out.println(String.format("%-15s %-15s", "Role Id", "Name"));
		for(int i=0;i<roleList.size();i++){
			System.out.println(roleList.get(i));
		}
		
		System.out.println("Enter the user details");
		ArrayList<User> userList = new ArrayList<User>();
		String choice = "Yes";
		String[] temp = new String[3];
		User user = null;
		Role role = null;
		while("Yes".equalsIgnoreCase(choice)){	
			temp = br.readLine().split(",");
			user = new User(new Integer(Integer.parseInt(temp[0])), temp[1]);
			role = new Role();
			role.setRoleName(temp[2]);
			user.setRole(role);
			userList.add(user);
			
			System.out.println("Do you want to continue[Yes/No]");
			choice = br.readLine();
		}
		
		for(int i=0;i<roleList.size();i++){
			role = roleList.get(i);
			for(int j=0;j<userList.size();j++){
				user = userList.get(j);
				if(role.getRoleName().equalsIgnoreCase(user.getRole().getRoleName())){
					role.getUserList().add(user);
				}
			}
		}
		
		
		System.out.println("User details");
		System.out.println(String.format("%-15s %-15s %-15s","User Id", "User Name", "Role Name"));
		for(int i=0;i<userList.size();i++){
			System.out.println(userList.get(i));
		}
		
		System.out.println("Enter the user id to be deleted");
		int userId = Integer.parseInt(br.readLine());
		
		RoleBO roleBO = new RoleBO();
		roleBO.removeUserInUserList(userId, userList);
		
		System.out.println("User details after deletion");
		System.out.println(String.format("%-15s %-15s %-15s","User Id", "User Name", "Role Name"));
		for(int i=0;i<userList.size();i++){
			System.out.println(userList.get(i));
		}
		
		System.out.println("Enter the role to search the user");
		
	}

}
