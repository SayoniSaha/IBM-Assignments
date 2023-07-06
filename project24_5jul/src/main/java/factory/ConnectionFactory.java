package factory;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class ConnectionFactory {
	private   Connection conn = null;
	private static ConnectionFactory cf;
	private ConnectionFactory() throws SQLException {	 
	}
	
	public Connection getConnection() throws SQLException {
		DriverManager.registerDriver(new Driver());
		String url ="jdbc:mysql://localhost:3306/orders";
		String user ="root";
		String pass ="root";
		conn = DriverManager.getConnection(url,user,pass);
		return conn;
	}
	
	public static ConnectionFactory getMyFactory() throws SQLException {
		try {
			if(cf == null) {
				cf = new ConnectionFactory();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cf;
	}
}

