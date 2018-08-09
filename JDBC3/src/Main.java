import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
        
        RoleDAO roleDAO = new RoleDAO();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        PrivilegeDAO privilegeDAO = new PrivilegeDAO();
        List<Privilege> privileges = privilegeDAO.getAllPrivileges();
        System.out.println("List of privileges :");
        System.out.format("%-15s %s\n","Privilege ID","Privilege Name");
        for(int i=0;i<privileges.size();i++) {
            System.out.format("%-15s %s\n",privileges.get(i).getId(),privileges.get(i).getName());
        }
        
        System.out.println("Enter number of new Roles to be created :");
        Integer n = Integer.parseInt(br.readLine());
        
        System.out.println("Enter the role and privileges :");

        //fill the code
       String[] temp = {};
       List<Role> roleList = new ArrayList<Role>();
        ArrayList<Privilege> privilegeList = null;
        Role role = null;
        for(int i=0;i<n;i++){
        	privilegeList = new ArrayList<Privilege>();
        	temp = (br.readLine()).split(",");
        	role = new Role(temp[0]);
        	for(int j=1;j<temp.length;j++){
        		privilegeList.add(new Privilege(0, temp[j]));
        	}
        	role.setPrivilegeList(privilegeList);
        	roleList.add(role);
        }
        
        for(int i=0;i<n;i++){
        	role = roleList.get(i);
        	roleDAO.createRole(role, role.getPrivilegeList());
        }
        
        System.out.println("Enter the Role :");
        String rol = br.readLine();
        System.out.println("Privileges for "+rol+" :");

        //fill the code
        List<Privilege> privilegesList = new ArrayList<Privilege>();
        privilegesList = roleDAO.getPreviligeByRole(rol);
        for(int i=0;i<privilegesList.size();i++){
        	System.out.println(privilegesList.get(i).getName());
        }
    }
}
