

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDAO {

    public ArrayList<User> getAllUsers() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
      // fill the code
    	Connection con = DbConnection.getConnection();
    	Statement st = con.createStatement();
    	ResultSet rs = st.executeQuery("select u.name, r.name, c.street, c.city, c.state from user u, role r, contact c where u.contact_id = c.id and u.role_id = r.id order by u.name");
    	
    	User user = null;
    	Contact contact = null;
    	Role role = null;
    	ArrayList<User> userList = new ArrayList<User>();
    	while(rs.next()){
    		role = new Role(0, rs.getString(2));
    		contact = new Contact(0, rs.getString(3), rs.getString(4), rs.getString(5));
    		user = new User(0, rs.getString(1), role, contact);
    		userList.add(user);
    	}
    	rs.close();
    	st.close();
    	con.close();
    	
    	return userList;
    }

}
