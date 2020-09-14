package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
	
		out.print("<!Doctype html>");
		out.print("<html>");
		out.print("<head>");
	
		out.print("</head>");
		out.print("<body>");
		
		out.print("<form action='info' method='GET'>");
		out.print("Name: <input type='text' name='username'>");
		
		out.print("<br />");
		out.print("password: <input type='text' name='password' />");
		out.print("<input type='submit' value='Submit' />");
		out.print("</form>");
		out.print("</body>");
		
		request.getRequestDispatcher("Array").include(request, response);
//		ArrayList drinksList = (ArrayList) request.getAttribute("drink");
//		
//		for(Object object : drinksList)
//		{
//			out.println("<input type='checkbox' name="+ object +"  value='1'>");
//			out.println("<='checkbox' name="+ object +"  value='1'>");
//			
//		}
		out.print("<form action='info1' method='GET'>");
		out.print("你喜歡什麼:"); 
		out.print("Coffee<input type='checkbox' name='Coffee' value='1'>");
		out.print("Tea<input type='checkbox' name='Tea' value='2'>");
		out.print("Juice<input type='checkbox' name='Juice' value='3'>");
		out.print("<input type='submit' value='Submit' />");
		out.print("</form>");
			 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
