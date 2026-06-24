a.student.html
<!DOCTYPE html>
<html>
<head>
<title>Student Details</title>
</head>
<body>
<h2>Enter Student Details</h2>
<form action="student" method="post">
Name: <input type="text" name="name" required><br><br>
USN: <input type="text" name="usn" required><br><br>
Marks 1: <input type="number" name="m1" required><br><br>
Marks 2: <input type="number" name="m2" required><br><br>
Marks 3: <input type="number" name="m3" required><br><br>
<input type="submit" value="Submit">
</form>
</body>
</html>
b.StudentServelet.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class StudentServlet extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
// Get data from form
String name = request.getParameter("name");
String usn = request.getParameter("usn");
int m1 = Integer.parseInt(request.getParameter("m1"));
int m2 = Integer.parseInt(request.getParameter("m2"));
int m3 = Integer.parseInt(request.getParameter("m3"));
// Calculate total
int total = m1 + m2 + m3;
// Display output
out.println("<html><body>");
out.println("<h2>Student Details</h2>");
out.println("Name: " + name + "<br>");
out.println("USN: " + usn + "<br>");
out.println("Marks 1: " + m1 + "<br>");
out.println("Marks 2: " + m2 + "<br>");
out.println("Marks 3: " + m3 + "<br>");
out.println("<h3>Total Marks: " + total + "</h3>");
out.println("</body></html>");
}
}
c.web.xml
<web-app>
<servlet>
<servlet-name>StudentServlet</servlet-name>
<servlet-class>StudentServlet</servlet-class>
</servlet>
<servlet-mapping>
<servlet-name>StudentServlet</servlet-name>
<url-pattern>/student</url-pattern>
</servlet-mapping>
</web-app>
