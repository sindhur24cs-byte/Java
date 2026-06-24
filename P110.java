login.jsp –
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<html>
<head>
<title>Login Page</title>
</head>
<body>
<h2>LOGIN PAGE</h2>
<form action="validate.jsp" method="post">
User ID:
<input type="text" name="userid">
<br><br>
Password:
<input type="password" name="password">
<br><br>
<input type="submit" value="Login">
</form>
</body>
</html>
validate.jsp -
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<html>
<body>
<%
String userid = request.getParameter("userid");
String password =
request.getParameter("password");
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con =
DriverManager.getConnection(
"jdbc:mysql://localhost:3306/loginDB",
"root",
"root@123");
PreparedStatement ps =
con.prepareStatement(
"select * from users where userid=? and password=?");
ps.setString(1, userid);
ps.setString(2, password);
ResultSet rs = ps.executeQuery();
if(rs.next()) {
out.println("<h2>Login Successful</h2>");
}
else {
out.println("<h2>Invalid User ID or Password</h2>");
}
con.close();
}
catch(Exception e) {
out.println(e);
}
%>
</body>
</html>
