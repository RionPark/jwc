<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Connection conn = null;
PreparedStatement ps =null;
ResultSet rs = null;
String sql ="";
String name ="";
double increase = 0.05;
try {
	conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "test", "test");
	conn.setAutoCommit(false);
	
	
	sql ="call increase_salary(?,?)";
	ps = conn.prepareStatement(sql);
	ps.setString(1,"dragon");
	ps.setDouble(2,increase);
	ps.executeUpdate();
	conn.commit();
	sql ="select *from empsalary where id=?";
	ps = conn.prepareStatement(sql);
	ps.setString(1,"dragon");
	rs = ps.executeQuery();
	if(rs.next()){
		 name =rs.getString("id");
	}
} catch (SQLException e) {
	e.printStackTrace();
}finally{
	try {
		rs.close();
		ps.close();
		conn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
%>
<%=name%>의 급여를 <%=increase %> 인상했습니다.
</body>
</html>