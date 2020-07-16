package 숙제.d20200716.김해성;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
	
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String ID = "c##test";
	private static final String PWD = "test";
	private static final String ORACLE_DRV = "oracle.jdbc.driver.OracleDriver";
	private static Connector con;
	
	static{
		try {
			Class.forName(ORACLE_DRV);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	public static Connection open()	{
		
			try {
				Connection con = DriverManager.getConnection(URL,ID,PWD);
				con.setAutoCommit(false);
				return con;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 return null;
	}
	
	public static void main(String[] args)	{
	
		Connection con = open();
		Statement stmt;
		try {
			stmt = con.createStatement();
			String sql = "select l_num,l_lentdate,l_recddate,m_num,b_num from lent ";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())	{
				System.out.println(rs.getInt("l_num"));
			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
