
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RoleDAO {

    public void createRole(Role roleIns, ArrayList<Privilege> privilegeList) throws SQLException, ClassNotFoundException {

    	//fill the code
    	Connection con = DbConnection.getConnection();
    	Statement st = con.createStatement();
    	String query = "insert into role(name) values('"+roleIns.getName()+"')";
    	st.executeUpdate(query);
    	ResultSet rs = st.executeQuery("select id from role where name='"+roleIns.getName()+"'");
    	int role_id = 0;
    	if(rs.next())
    		role_id = rs.getInt(1);
    	int privilege_id = 0;
    	String query1 = "";
    	for(int i=0;i<privilegeList.size();i++){
    		rs = st.executeQuery("select id from  privilege where name='"+privilegeList.get(i).getName()+"';");
    		if(rs.next())
    			privilege_id = rs.getInt(1);
    		query1 = "insert into role_privilege(role_id,privilege_id) values("+role_id+","+privilege_id+");";
    		st.executeUpdate(query1);
    	}
    	
    	rs.close();
    	st.close();
    	con.close();
    }
    
    public List<Privilege> getPreviligeByRole(String role) throws ClassNotFoundException, SQLException {

    	//fill the code
    	Connection con = DbConnection.getConnection();
    	Statement st = con.createStatement();
    	String query = "select privilege_id from role_privilege where role_id = (select id from role where name = '"+role+"')";
    	ResultSet rs = st.executeQuery(query);
    	Statement st1 = con.createStatement();
    	ResultSet rs1 = null;
    	
    	Privilege privilege = null;
    	List<Privilege> privilegeList = new ArrayList<Privilege>();
    	while(rs.next()){
    		privilege = new Privilege();
    		privilege.setId(rs.getInt(1));
    		rs1 = st1.executeQuery("select name from privilege where id = "+privilege.getId());
    		if(rs1.next())
    			privilege.setName(rs1.getString(1));
    		privilegeList.add(privilege);
    	}
    	
    	rs1.close();
    	rs.close();
    	st1.close();
    	st.close();
    	con.close();
    	
    	return privilegeList;
    }
}