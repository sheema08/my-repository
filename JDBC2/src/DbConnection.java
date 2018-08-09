
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class DbConnection {

	public static Connection getConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		ResourceBundle rb = ResourceBundle.getBundle("mysql");
		String url = rb.getString("db.url");
		String username = rb.getString("db.username");
		String password = rb.getString("db.password");
		Connection connect = null;

	    // fill the code
		Class.forName("com.mysql.jdbc.Driver");	
		connect = DriverManager.getConnection(url, username, password);	
		return connect;
    }
}
