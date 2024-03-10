package com.example.WelcomeToCOMP367;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {
            // Write HTML content
            response.getWriter().println("<html>");
            response.getWriter().println("<head>");
            response.getWriter().println("<title>Welcome to COMP367</title>");
            response.getWriter().println("</head>");
            response.getWriter().println("<body>");
            response.getWriter().println("<h1>Welcome to COMP367</h1>");
            response.getWriter().println("</body>");
            response.getWriter().println("</html>");
        } finally {
            response.getWriter().close();
        }
    }
}