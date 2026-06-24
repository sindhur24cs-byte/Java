a.Index.html
<!DOCTYPE html>
<html>
<head>
<title>Greeting App</title>
</head>
<body>
<h2>Enter Your Name</h2>
<form action="greet" method="post">
Name: <input type="text" name="username" required>
<input type="submit" value="Submit">
</form>
</body>
</html>
b.GreetServelet.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class GreetServlet extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
// Get username from client
String name = request.getParameter("username");
// Display greeting message
out.println("<html><body>");
out.println("<h2>Hello, " + name + "!</h2>");
out.println("<p>Welcome to Servlet Programming</p>");
out.println("</body></html>");
}
}
c.Web.xml
<web-app>
<servlet>
<servlet-name>GreetServlet</servlet-name>
<servlet-class>GreetServlet</servlet-class>
</servlet>
<servlet-mapping>
<servlet-name>GreetServlet</servlet-name>
<url-pattern>/greet</url-pattern>
</servlet-mapping>
</web-app>
