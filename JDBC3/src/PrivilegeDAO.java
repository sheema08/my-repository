import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PrivilegeDAO {
	
	public List<Privilege> getAllPrivileges() throws SQLException, ClassNotFoundException {

		//fill the code
		Connection con = DbConnection.getConnection();
    	Statement st = con.createStatement();
    	ResultSet rs = st.executeQuery("select id, name from privilege");
    	
    	List<Privilege> privilegeList = new ArrayList<Privilege>();
    	Privilege privilege = null;

    	while(rs.next()){
    		privilege = new Privilege(rs.getInt(1), rs.getString(2));
    		privilegeList.add(privilege);
    	}
    	rs.close();
    	st.close();
    	con.close();
    	
    	return privilegeList;
	}
	
}