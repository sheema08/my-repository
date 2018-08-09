import java.sql.*;
import java.util.*;
public class RoleDAO {
    
    public List<Role> getAllRoles() throws Exception
    {
        //fill code here.
    	Connection con = DbConnection.getConnection();
    	Statement st = con.createStatement();
    	ResultSet rs = st.executeQuery("select * from role order by name;");
    	List<Role> roleList = new ArrayList<Role>();
    	Role role = null;
    	while(rs.next()){
    		role = new Role(rs.getInt(1), rs.getString(2), rs.getString(3));
    		roleList.add(role);
    	}
    	rs.close();
    	st.close();
    	con.close();
    	return roleList;
    }
    
}
