package 숙제.d20200716.김현배.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import 숙제.d20200716.김현배.common.Connector;
import 숙제.d20200716.김현배.dao.MemberDAO;


public class MemberDAOImpl implements MemberDAO {

	@Override
	public int insertMember(Map<String, Object> member) {
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			conn = Connector.getConnection();
			String sql = "insert into member(m_num, m_name, m_id, m_pwd, m_joindate) ";
			sql += " values(seq_member_m_num.nextval, ?, ?, ?, sysdate) ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, member.get("m_name").toString());
			ps.setString(2, member.get("m_id").toString());
			ps.setString(3, member.get("m_pwd").toString());
			result = ps.executeUpdate();
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	@Override
	public int updateMember(Map<String, Object> member) {
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			conn = Connector.getConnection();
			String sql = "update member set ";
			sql += " m_name = ?,";
			sql += " m_id = ?,";
			sql += " m_pwd = ? ";
			sql += " where m_num = ? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, member.get("m_name").toString());
			ps.setString(2, member.get("m_id").toString());
			ps.setString(3, member.get("m_pwd").toString());
			ps.setInt(4, (int)member.get("m_num"));
			result = ps.executeUpdate();
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	@Override
	public int deleteMember(int mNum) {
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			conn = Connector.getConnection();
			String sql = "delete from member where m_num = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, mNum);
			result = ps.executeUpdate();
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	@Override
	public List<Map<String, Object>> selectMemberList(Map<String, Object> member) {
		List<Map<String, Object>> mList = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = Connector.getConnection();
			String sql = "select m_num, m_name, m_id, m_pwd, m_joindate from member ";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Map<String, Object> mMap = new HashMap<>();
				mMap.put("m_num", rs.getInt("m_num"));
				mMap.put("m_name", rs.getString("m_name").toString());
				mMap.put("m_id", rs.getString("m_id").toString());
				mMap.put("m_pwd", rs.getString("m_pwd").toString());
				mMap.put("m_joindate", rs.getString("m_joindate").toString());
				mList.add(mMap);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return mList;
	}

	@Override
	public Map<String, Object> selectMember(int mNum) {
		Map<String, Object> mMap = new HashMap<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = Connector.getConnection();
			String sql = "select m_num, m_name, m_id, m_pwd, m_joindate from member ";
			sql += " where m_num = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, mNum);
			rs = ps.executeQuery();
			if (rs.next()) {
				mMap.put("m_num", rs.getInt("m_num"));
				mMap.put("m_name", rs.getString("m_name").toString());
				mMap.put("m_id", rs.getString("m_id").toString());
				mMap.put("m_pwd", rs.getString("m_pwd").toString());
				mMap.put("m_joindate", rs.getString("m_joindate").toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return mMap;
	}
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		map.put("m_name", "김현배");
		map.put("m_id", "hyunbae9242");
		map.put("m_pwd", "123456");
		Map<String, Object> upMap = new HashMap<>();
		map.put("m_name", "김현배");
		map.put("m_id", "gusqoekt");
		map.put("m_pwd", "123456789");
		map.put("m_num", "1");
		MemberDAOImpl mdao = new MemberDAOImpl();
		mdao.deleteMember(22);
		System.out.println(mdao.selectMemberList(map));
		mdao.updateMember(upMap);
		System.out.println(mdao.selectMemberList(map));
		mdao.insertMember(map);
		System.out.println(mdao.selectMemberList(map));
				
	}
	
}
