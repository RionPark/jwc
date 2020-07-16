package 숙제.d20200716.김상영.Impl;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connector {

	private static final String url = "jdbc:oracle:thin:@localhost:1521/xe";
	private static final String id = "c##test";
	private static final String pwd = "test";
	private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	static {
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection open() {
		try {
			Connection con = DriverManager.getConnection(url, id, pwd);
			con.setAutoCommit(false);
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		Connection con = open();
		try {
			Statement stmt = con.createStatement();
			String sql = "select l_num, l_lentdate, l_recdate, m_num, b_num from lent";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				
				System.out.println(rs.getInt("l_num"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
