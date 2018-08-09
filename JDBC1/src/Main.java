import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
        // fill the code
		try{
			RoleDAO roleDAO = new RoleDAO();
			
			ArrayList<Role> roleList = roleDAO.getAllRoles();
			
			System.out.println("Role Details:");
			for(int i=0;i<roleList.size();i++){
				System.out.println(roleList.get(i).getName());
			}
		}catch(Exception e){
			System.out.println("Exception caught");
		}
    }

}
