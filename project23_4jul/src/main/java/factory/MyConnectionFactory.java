package factory;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class MyConnectionFactory {
	private   Connection conn = null;
	private static MyConnectionFactory cf;
	private MyConnectionFactory() throws SQLException {	 
	}
	
	public Connection getConnection() throws SQLException {
		DriverManager.registerDriver(new Driver());
		String url ="jdbc:mysql://localhost:3306/course";
		String user ="root";
		String pass ="root";
		conn = DriverManager.getConnection(url,user,pass);
		return conn;
	}
	
	public static MyConnectionFactory getMyFactory() throws SQLException {
		try {
			if(cf == null) {
				cf = new MyConnectionFactory();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cf;
	}
}
