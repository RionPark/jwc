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
import 숙제.d20200716.박윤상.dao.Impl.LentDAO;

public class LentDAOImpl implements LentDAO {

	
	public int insertLent(Map<String, Object> lent) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = Connector.open();
			String sql = "insert into book(l_num,l_lentdate,l_recdate,m_num,b_num)";
			sql += " values(seq_lent_l_num.nextval,sysdate ,null,?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1,(int)lent.get("m_num"));
			ps.setInt(2,(int)lent.get("b_num"));
			
			result = ps.executeUpdate();
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


	public int updateLent(Map<String, Object> lent) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = Connector.open();
			String sql = "update lent";
			sql +=" set l_recdate=sysdate where l_num=?";
			
			
			ps=con.prepareStatement(sql);
			ps.setInt(1,(int)lent.get("l_num"));
			
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

	
	public int deleteLent(int lNum) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = Connector.open();
			String sql = "delete from lent where l_num=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1,lNum);
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

	
	public List<Map<String, Object>> selectLentList(Map<String, Object> lent) {
		List<Map<String, Object>>lentList=new ArrayList<Map<String,Object>>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		
		try {
			con = Connector.open();
			String sql="select l_num,l_lentdate,l_recdate,m_num,b_num from lent";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				Map<String,Object>map=new HashMap<>();
				map.put("l_num",rs.getInt("l_num"));
				map.put("l_lentdate",rs.getString("l_lentdate"));
				map.put("l_recdate",rs.getString("l_recdate"));
				map.put("m_num",rs.getString("m_num"));
				map.put("b_num",rs.getString("b_num"));
				lentList.add(map);
				
			}
			return lentList;
		}catch(Exception e){
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

	@Override
	public Map<String, Object> selectLent(int lNum) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		try {
			con = Connector.open();
			String sql="select l_num,l_lentdate,l_recdate,m_num,b_num from lent where l_num=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1,lNum);
			rs=ps.executeQuery();
			
			if(rs.next()){
				Map<String,Object>map=new HashMap<>();
				map.put("l_num",rs.getInt("l_num"));
				map.put("l_lentdate",rs.getString("l_lentdate"));
				map.put("l_recdate",rs.getString("l_recdate"));
				map.put("m_num",rs.getString("m_num").toString());
				map.put("b_num",rs.getString("b_num").toString());
				return map;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
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

		return  null;
		
	
	}

}
