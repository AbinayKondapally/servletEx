package com.Assignment;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String UN = req.getParameter("Username");
            String P = req.getParameter("password");

            ServletContext servletContext = getServletContext();
            String user = (String) servletContext.getAttribute("Username");
            String pw = (String) servletContext.getAttribute("password");

            if(user.equals(UN) && (pw.equals(P))){
                PrintWriter pp = resp.getWriter();
                pp.print("Welcome");
            }else{
                PrintWriter pl = resp.getWriter();
                pl.print("<html><body> Invalid username or password </body></html>");

                RequestDispatcher requestDispatcher = req.getRequestDispatcher("LogInPage.html");
                requestDispatcher.include(req, resp);
            }
        }


   /* protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String UN = req.getParameter("Username");
        String P = req.getParameter("password");

        ServletContext servletContext = getServletContext();
        String user = (String) servletContext.getAttribute("Username");
        String pw = (String) servletContext.getAttribute("password");

        if(user.equals(UN) && (pw.equals(P))){
           PrintWriter pp = resp.getWriter();
           pp.print("Welcome");
        }else{
            PrintWriter pl = resp.getWriter();
            pl.print("<html><body> Invalid username or password </body></html>");

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("LogInPage.html");
           requestDispatcher.include(req, resp);
        }
    }*/
}
