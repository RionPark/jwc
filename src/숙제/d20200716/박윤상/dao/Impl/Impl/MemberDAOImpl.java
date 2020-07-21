package 숙제.d20200716.박윤상.dao.Impl.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import 숙제.d20200716.박윤상.common.Connector;
import 숙제.d20200716.박윤상.dao.Impl.MemberDAO;

public class MemberDAOImpl implements MemberDAO {

	public int insertMember(Map<String, Object> member) {
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			conn = Connector.open();
			String sql = "insert into member(m_num, m_name, m_id,m_pwd,m_credat)\r\n" + 
					"values(\r\n" + 
					"seq_member_m_num.nextval, ?,?,?,sysdate)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, member.get("m_name").toString());
			ps.setString(2, member.get("m_id").toString());
			ps.setString(3, member.get("m_pwd").toString());
			result = ps.executeUpdate();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return 0;
	}

	public int updateMember(Map<String, Object> member) {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		try {
			con=Connector.open();
			String sql="update member";
			sql+=" set m_name=?,";
			sql+="  m_id=?,";
			sql+="  m_pwd=?";
			sql+=" where m_num=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,member.get("m_name").toString());
			ps.setString(2,member.get("m_id").toString());
			ps.setString(3,member.get("m_pwd").toString());
			ps.setInt(4,(int)member.get("m_num"));
			result=ps.executeUpdate();
			return result;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) {
					ps.close();
				}
				if(con!=null) {
					con.close();
				}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

		return 0;	
	}

	public int delectMember(int mNum) {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		try {
			con = Connector.open();
			String sql = "delete from member where m_num=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1,mNum);
			result=ps.executeUpdate();
			con.commit();
			return result;
			
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

	public List<Map<String, Object>> selectMemberList(Map<String, Object> member) {
		List<Map<String,Object>>memberList=new ArrayList<Map<String,Object>>();
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        try {
        	con=Connector.open();
        	String sql="select m_num,m_name,m_id,m_pwd,m_credat from member";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()) {
            	Map<String,Object>map=new HashMap<>();
            	map.put("m_num",rs.getInt("m_num"));
            	map.put("m_name",rs.getString("m_name"));
            	map.put("m_id",rs.getString("m_id"));
            	map.put("m_pwd",rs.getString("m_pwd"));
            	map.put("m_credat",rs.getString("m_credat"));
            	memberList.add(map);
            	
           }
            return memberList;
        }catch(Exception e) {
        	e.printStackTrace();
        }finally {
        	try {
        		if(ps!=null) {
        			ps.close();
        		}
        		if(con!=null) {
        			con.close();
        		}
        	}catch(SQLException e) {
        		e.printStackTrace();
        	}
        }
		return null;
		
	}

	public Map<String, Object> selectMember(int mNum) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=Connector.open();
			String sql="select m_num,m_name,m_id,m_pwd,m_credat from member where m_num=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, mNum);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				Map<String,Object>map=new HashMap<>();
				map.put("m_num",rs.getInt("m_num"));
				map.put("m_name",rs.getString("m_name"));
				map.put("m_id",rs.getString("m_id"));
				map.put("m_pwd",rs.getString("m_pwd"));
				map.put("m_credat",rs.getString("m_credat"));
				return map;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) {
					ps.close();
				}
				if(con!=null) {
					con.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}

		return null;
		
	}

	public static void main(String[] args) {
		MemberDAO test = new MemberDAOImpl();
		Map<String, Object> map = new HashMap<>();
		map.put("m_name","박윤상");
		map.put("m_id", "nnys1");
		map.put("m_pwd","111");
		test.insertMember(map);
		System.out.println(map);
	}

}
