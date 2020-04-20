
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Monu
 */
public class NewServlet extends HttpServlet {

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String username = request.getParameter("uname");
           String password = request.getParameter("psw");
           if(username != null && password != null)
           {
                if(username.equals("monu") && password.equals("1234"))
                {
                    response.sendRedirect("Welcome.html");
                }
                else
                {
                  out.println("Wrong username or password");  
                }
           }
           else
           {
                   out.println("Please enter the credentials");
                   }
        }
    }

  

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    
}
