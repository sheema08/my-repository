import java.util.*;
import java.sql.*;
public class CargoDAO {
    
    List<Cargo> filterCargoByWeight(Float weight) throws Exception
    {
        //fill code here.
    	Connection con = DbConnection.getConnection();
    	Statement st = con.createStatement();
    	ResultSet rs = st.executeQuery("select * from cargodetail where weight >"+weight);
    	List<Cargo> cargoList = new ArrayList<Cargo>();
    	Cargo cargo = null;
    	while(rs.next()){
    		cargo = new Cargo(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getFloat(4), rs.getFloat(5));
    		cargoList.add(cargo);
    	}
    	rs.close();
    	st.close();
    	con.close();
    	return cargoList;
    }    
}
