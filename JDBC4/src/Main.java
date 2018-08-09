import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        int choice,roleId,c=0;
        String userDetails, roleName = "";
        Role role=null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        User user;
        RoleDAO roleDAO = new RoleDAO();
        UserDAO userDAO = new UserDAO();
        String[] temp = new String[4];
        while(true)
        {
            System.out.println("1. Create User\n2. Display Details\n3. Exit\nEnter the choice :");
            choice = Integer.parseInt(br.readLine());
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the user details:");
                    //fill code here.
                    userDetails = br.readLine();
                    temp = userDetails.split(",");
                    System.out.println("Role details:");
                    System.out.format("%-15s %-25s %s\n","Role id","Role name","Role description");
                    //fill code here.
                    List<Role> roleList = roleDAO.getAllRoles();
                    for(int i=0;i<roleList.size();i++){
                    	System.out.println(roleList.get(i));
                    }
                    System.out.println("Enter the role id:");
                    roleId = Integer.parseInt(br.readLine());
                    //fill code here.
                    for(int i=0;i<roleList.size();i++){
                    	if(roleId == roleList.get(i).getId()){
                    		roleName = roleList.get(i).getRoleName();
                    		break;
                    	}
                    }
                    userDAO.createUser(new User(temp[0], temp[1], temp[2], temp[3], new Role(0, roleName, "")));
                    break;
                case 2:
					userDAO.displayDetails();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
    
}
