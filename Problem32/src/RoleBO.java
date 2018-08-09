import java.util.ArrayList;


public class RoleBO {
	public Role findRoleByRoleName(String roleName,ArrayList<Role> roleList){
		Role role = new Role();
		for(int i=0;i<roleList.size();i++){
			if(roleName.equalsIgnoreCase(roleList.get(i).getRoleName())){
				role = roleList.get(i);
			}
		}
		return role;
	
	}
	
	public Role findRoleByUserId(Integer userId,ArrayList<User> userList) {
		Role role = new Role();
		for(int i=0;i<userList.size();i++){
			if(userId == userList.get(i).getId()){
				role = userList.get(i).getRole();
			}
		}
		return role;
	}
	
	public void removeUserInRole(Integer userId,Role role,ArrayList<Role> roleList){
		for(int i=0;i<roleList.size();i++){
			ArrayList<User> userList = roleList.get(i).getUserList();
			for(int j=0;j<userList.size();j++){
				if(userId == userList.get(j).getRole().getRoleId()){
					roleList.get(i).getUserList().remove(j);
				}
			}
		}
	}
	
	public void removeUserInUserList(Integer userId,ArrayList<User> userList){
		for(int i=0;i<userList.size();i++){
			if(userId == userList.get(i).getId()){
				userList.remove(i);
				break;
			}
		}
	}
}
