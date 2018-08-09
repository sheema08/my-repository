

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RoleDAO {

    public ArrayList<Role> getAllRoles() throws ClassNotFoundException, SQLException{
      // fill the code
    	Connection con = DbConnection.getConnection();
    	Statement st = con.createStatement();
    	ResultSet rs = st.executeQuery("select id, name from role order by name");
    	
    	Role role = null;
    	ArrayList<Role> roleList = new ArrayList<Role>();
    	while(rs.next()){
    		role = new Role(rs.getInt(1), rs.getString(2));
    		roleList.add(role);
    	}
    	rs.close();
    	st.close();
    	con.close();
    	
    	return roleList;
    }

}
