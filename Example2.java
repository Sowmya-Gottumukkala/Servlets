package  Day5Servlets.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Example2")
public class Example2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<h1>doGet is working</h1>");
	        System.out.println("doGet is wng"); 
	        
	    } 

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        doGet(request, response);
	        System.out.println("doPost is working");
	    }

}
