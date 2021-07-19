package chap02.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	
	private static String url;
	private static String user;
	private static String password;
	
	static {
		try {
			Class.forName("jdbc:oracle:thin:@localhost:1521/XEPDB1");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static java.sql.Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url, user, password);
		
		return null;
	}
}
