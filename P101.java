package pgm10;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/cookie")
public class CookieExample extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie c = new Cookie("RNSIT", "RNSIT123");

        response.addCookie(c);

        out.println("<h2>Cookie Created Successfully</h2>");

        Cookie cookies[] = request.getCookies();

        if (cookies != null) {
            out.println("<h3>Reading Cookie:</h3>");

            for (Cookie ck : cookies) {
                if (ck.getName().equals("RNSIT")) {
                    out.println("Cookie Name : " + ck.getName() + "<br>");
                    out.println("Cookie Value : " + ck.getValue());
                }
            }
        }
    }
}
