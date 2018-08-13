package com.Assignment;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Registration extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String FN = req.getParameter("Firstname");
        String LN = req.getParameter("Lastname");
        String EM = req.getParameter("email");
        String UN = req.getParameter("Username");
        String P  = req.getParameter("password");


        if((UN!=null) && (P!=null) && (UN != "") &&(P != "") ){

            PrintWriter pm = resp.getWriter();

            ServletContext servletContext = getServletContext();
            servletContext.setAttribute("Username", UN);
            servletContext.setAttribute("password",P);

pm.print("hello");
pm.print("welcome now");
            pm.print("welcome again");

            //RequestDispatcher RD = req.getRequestDispatcher("LogInPage.html");
            //RD.include(req, resp);
        }
        else{
     /*PrintWriter pp=resp.getWriter();
     pp.print("Please do not leave blocks Empty");*/
            resp.getWriter().print("<font color = 'blue'><b> Enter Valid Information</b></font>");

            RequestDispatcher RD = req.getRequestDispatcher("RegistrationPage.html");
            RD.include(req, resp);
        }


    }


   /* protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String FN = req.getParameter("Firstname");
        String LN = req.getParameter("Lastname");
        String EM = req.getParameter("email");
        String UN = req.getParameter("Username");
        String P  = req.getParameter("password");


 if((UN!=null) && (P!=null) && (UN != "") &&(P != "") ){

     ServletContext servletContext = getServletContext();
     servletContext.setAttribute("Username", UN);
     servletContext.setAttribute("password",P);

     RequestDispatcher RD = req.getRequestDispatcher("LogInPage.html");
     RD.include(req, resp);
 }
 else{
     //PrintWriter pp=resp.getWriter();
    // pp.print("Please do not leave blocks Empty");
     resp.getWriter().print("<font color = 'blue'><b> Enter Valid Information</b></font>");

    RequestDispatcher RD = req.getRequestDispatcher("RegistrationPage.html");
     RD.include(req, resp);
 }


    }*/
}
