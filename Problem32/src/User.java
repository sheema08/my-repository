public class User {

	Integer id;
	String name;
	Role role = new Role();

	User(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	void setId(Integer id) {
		this.id = id;
	}

	Integer getId() {
		return id;
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setRole(Role role) {
		this.role = role;
	}

	Role getRole() {
		return role;
	}
	
	public String toString() {
		return String.format("%-15s %-15s %-15s", getId(), getName(), getRole().getRoleName());
	}

}
