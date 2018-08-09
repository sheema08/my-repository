import java.util.ArrayList;

public class Role {

	Integer roleId;
	String roleName;
	ArrayList<User> userList = new ArrayList<User>();

	Role() {
	}

	Role(Integer roleId, String roleName) {
		this.roleId = roleId;
		this.roleName = roleName;
		this.userList = new ArrayList<User>();
	}

	void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	Integer getRoleId() {
		return roleId;
	}

	void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	String getRoleName() {
		return roleName;
	}

	void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}

	ArrayList<User> getUserList() {
		return userList;
	}

	public String toString() {
		return String.format("%-15s %-15s", getRoleId(), getRoleName());
	}

}
