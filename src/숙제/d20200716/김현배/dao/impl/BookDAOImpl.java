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
import 숙제.d20200716.김현배.dao.BookDAO;


public class BookDAOImpl implements BookDAO {

	@Override
	public int insertBook(Map<String, Object> book) {
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			conn = Connector.getConnection();
			String sql = "insert into book(b_num, b_title, b_author, b_credat, b_desc) ";
			sql += " values(seq_book_b_num.nextval, ?, ?, sysdate, ?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, book.get("b_title").toString());
			ps.setString(2, book.get("b_author").toString());
			ps.setString(3, book.get("b_desc").toString());
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
	public int updateBook(Map<String, Object> book) {
		Connection conn = null;
		PreparedStatement ps = null;
		int result= 0;
		try {
			conn = Connector.getConnection();
			if(book.get("b_title")!=null) {
				
			}
			String sql = " UPDATE book set ";
			sql += " b_title = ?, ";
			sql += " b_author = ?, ";
			sql += " b_desc = ? ";
			sql += " where b_num = ? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, book.get("b_title").toString());
			ps.setString(2, book.get("b_author").toString());
			ps.setString(3, book.get("b_desc").toString());
			ps.setInt(4, (int)book.get("b_num"));
			result = ps.executeUpdate();
			conn.commit();
		}catch (Exception e) {
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
	public int deleteBook(int bNum) {
		Connection conn = null;
		PreparedStatement ps = null;
		int result= 0;
		try {
			conn = Connector.getConnection();
			String sql = "delete from book " 
					   + " where b_num =?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bNum);
			result = ps.executeUpdate();
			conn.commit();
		}catch (Exception e) {
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
	public List<Map<String, Object>> selectBookList(Map<String, Object> book) {
		List<Map<String, Object>> bookList = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = Connector.getConnection();
			String sql = "select b_num, b_title, b_author, b_credat, b_desc from book";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Map<String, Object> map = new HashMap<>();
				map.put("b_num", rs.getInt("b_num"));
				map.put("b_title", rs.getString("b_title"));
				map.put("b_author", rs.getString("b_author"));
				map.put("b_credat", rs.getString("b_credat"));
				map.put("b_desc", rs.getString("b_desc"));
				bookList.add(map);
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
		return bookList;
	}

	@Override
	public Map<String, Object> selectBook(int bNum) {
		Map<String, Object> book = new HashMap<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = Connector.getConnection();
			String sql = "select b_num, b_title, b_author, b_credat, b_desc from book " 
					   + " where b_num =?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bNum);
			rs = ps.executeQuery();
			if(rs.next()) {
				book.put("b_num", rs.getInt("b_num"));
				book.put("b_title", rs.getString("b_title"));
				book.put("b_author", rs.getString("b_author"));
				book.put("b_credat", rs.getString("b_credat"));
				book.put("b_desc", rs.getString("b_desc"));
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
		return book;
	}

	public static void main(String[] args) {
		BookDAO bdao = new BookDAOImpl();
		Map<String, Object> map = new HashMap<>();
		map.put("b_title", "자바의정석");
		map.put("b_author", "남궁성");
		map.put("b_desc", "광고 확실하다.");
		map.put("b_num", 2);
//		bdao.insertBook(map);
//		List<Map<String,Object>> bookList =  bdao.selectBook(map);
//		System.out.println(bookList);
//		System.out.println(bdao.selectBook(21));
		
//		System.out.println("삭제 갯수 : " + bdao.deleteBook(21));
		int result = bdao.updateBook(map);
		System.out.println(result);
	}
}
