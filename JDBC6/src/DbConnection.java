import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
public class DbConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {        
        ResourceBundle rb= ResourceBundle.getBundle("mysql");
        String url = rb.getString("db.url");
        String username = rb.getString("db.username");
        String password = rb.getString("db.password");

        //fill the code
        Connection connect = null;
		Class.forName("com.mysql.jdbc.Driver");	
		connect = DriverManager.getConnection(url, username, password);	
		return connect;
    }
}