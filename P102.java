

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class StudentServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String usn = request.getParameter("usn");

        int m1 = Integer.parseInt(request.getParameter("m1"));
        int m2 = Integer.parseInt(request.getParameter("m2"));
        int m3 = Integer.parseInt(request.getParameter("m3"));

        int total = m1 + m2 + m3;

        out.println("<html>");
        out.println("<head><title>Student Details Summary</title></head>");
        out.println("<body>");
        out.println("<h2>Student Details</h2>");
        out.println("Name: " + name + "<br>");
        out.println("USN: " + usn + "<br>");
        out.println("Marks 1: " + m1 + "<br>");
        out.println("Marks 2: " + m2 + "<br>");
        out.println("Marks 3: " + m3 + "<br>");
        out.println("<h3>Total Marks: " + total + "</h3>");
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}
