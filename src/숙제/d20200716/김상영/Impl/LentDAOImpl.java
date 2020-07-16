package 숙제.d20200716.김상영;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LentDAOImpl {

	public int insertLent(Map<String, Object> Lent) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = Connector.open();
			String sql = "insert into Lent(L_num, L_lentdate, L_recdate, m_num, b_num)";
			sql += "values(seq_Lent_L_num.nextval,?,sysdate,sysdate,?,?)";
			ps = con.prepareStatement(sql);
			ps.setNString(1, Lent.get("L_lentdate").toString());
			ps.setNString(2, Lent.get("L_recdate").toString());
			ps.setInt(3, (int)Lent.get("m_num"));
			ps.setInt(4, (int)Lent.get("b_num"));
			result = ps.executeUpdate();
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	public int updateLent(Map<String, Object> lent) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = Connector.open();
			String sql = "update lent";
			sql += " set l_lentdate=?,";
			sql += "l_recdate=?,";
			sql += "m_num=?" ;
			sql += "b_num=?" ;
			sql += "where l_num=?";
			ps = con.prepareStatement(sql);
			
			ps.setString(1, lent.get("l_lentdate").toString());
			ps.setString(2, lent.get("l_credate").toString());
			ps.setInt(3, (int)lent.get("m_num"));
			ps.setInt(4, (int)lent.get("b_num"));
			result = ps.executeUpdate();
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public int deleteLent(int lNum) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = Connector.open();
			String sql = "delete from lent where l_num=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, lNum);
			result = ps.executeUpdate();
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public List<Map<String, Object>> selectLentList(Map<String, Object> lent) {
		List<Map<String, Object>> lentList = new ArrayList<Map<String, Object>>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = Connector.open();
			String sql = "select l_num, l_lentdate, l_credate, m_num, b_num from list";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Map<String, Object> map = new HashMap<>();
				map.put("l_num", rs.getInt("l_num"));
				map.put("l_credate", rs.getString("l_credate"));
				map.put("l_recdate", rs.getString("l_recdate"));
				map.put("m_num", rs.getInt("m_num"));
				map.put("b_num", rs.getInt("b_num"));
				lentList.add(map);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
		return lentList;
	}

	public Map<String, Object> selectLent(int lNum) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = Connector.open();
			String sql = "select l_num, l_credate, l_recdate, m_num, b_num from lent where l_num=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, lNum);
			rs = ps.executeQuery();
			if (rs.next()) {
				Map<String, Object> map = new HashMap<>();
				map.put("l_num", rs.getInt("l_num"));
				map.put("l_lentdate", rs.getString("l_lentdate"));
				map.put("l_credate", rs.getString("l_credate"));
				map.put("m_num", rs.getString("m_num"));
				map.put("b_num", rs.getString("b_num"));
				return map;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
		return null;
	}

	public static void main(String[] args) {
		LentDAOImpl bdao = new LentDAOImpl();
		Map<String, Object> map = new HashMap<>();
		map.put("l_lentdate", "1");
		map.put("l_credate", "1");
		map.put("m_num", "1");
		map.put("b_num", "2");
		// bdao.insertBook(map);
//		List<Map<String, Object>> bookList = bdao.selectBookList(map);
//		int result = bdao.deleteBook(2);
//		System.out.println("삭제 갯수:" + result);
map.put("b_num",1);
int result = bdao.updateLent(map);
System.out.println("수정갯수 :"+ result);
	}

}

