import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Welcome2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        PrintWriter printWriter = resp.getWriter();
        //printWriter.print("<html><body>Welcome2Servlet</body></html>");

      /* ServletConfig a = getServletConfig();
        System.out.println(a.getInitParameter("greetings"));*/

      String s1 = req.getParameter("username");
      String s2 = req.getParameter("userpassword");

      if(s1.equals("Abinay" )){
          printWriter.println("Success");
      }else{
          RequestDispatcher t = req.getRequestDispatcher("Today.jsp");
          t.forward(req, resp);
      }

      /*RequestDispatcher t = req.getRequestDispatcher("Today.jsp");
      t.forward(req, resp);*/

    }
}

