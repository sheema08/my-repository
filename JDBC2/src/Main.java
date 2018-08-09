import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		// fill the code
		UserDAO userDAOIns = new UserDAO();
		ArrayList<User> userList = null;
		
		userList = userDAOIns.getAllUsers();
	
		System.out.format("%-10s %-20s %-25s %-10s %-10s \n", "User",
				"Role", "Street", "City", "State");
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i));
		}		
	}
}
