<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.so.Connector"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.CallableStatement"%>
<%@page import="com.so.InitServlet"%>
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
	Connection con = Connection.open();
String sql = "{call prd_incress_salary(?,?)}";
try {
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, "id");
	ps.setDouble(2, 1.05);
	int result = ps.executeUpdate();
	out.println(result);
	out.println("dragon의 급여를 0.05 인상했습니다.");
} catch (SQLException e) {
	e.printStackTrace();
}finally {
	try {
		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
%>
</body>
</html>