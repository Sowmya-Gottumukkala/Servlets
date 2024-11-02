package Day5Servlets.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/world")
public class world extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private String msg;
   
	 public void init() throws ServletException {
	      // Do required initialization
	      msg = "Hello World";
	   }

	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
	      
	      // Set response content type
	      response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + msg + "</h1>");
	   }

	   public void destroy() {
	      // do nothing.
	   }
	}