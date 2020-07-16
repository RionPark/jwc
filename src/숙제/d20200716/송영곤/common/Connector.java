package 숙제.d20200716.송영곤.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private static final String ID = "c##test";
	private static final String PWD = "test";
	private static final String DN = "oracle.jdbc.driver.OracleDriver";
	private static Connection conn = null;
	static {
		try {
			Class.forName(DN);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		try {
			Connection conn = DriverManager.getConnection(URL, ID, PWD);
			conn.setAutoCommit(false);
			return conn;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}return null;
	}
	public static void close() {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		conn = null;
	}
}
