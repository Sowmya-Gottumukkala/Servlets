package ServletsExample1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/example")
public class  ServletsExample1 extends HttpServlet
{
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	 // Set response content type
        response.setContentType("text/html");

        // Get form data
        String username = request.getParameter("username");
        String email = request.getParameter("email");

        // Process the data (you could also save it to a database or perform other logic)
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Received POST Data</h2>");
        out.println("<p>Username: " + username + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("</body></html>");
    }

}
    
