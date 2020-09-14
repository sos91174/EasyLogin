package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class info
 */
@WebServlet("/info")
public class info extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public info() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
//		response.getWriter().append("GOGO!:").append(request.getContextPath());
		
		response.setContentType("text/html; charset=UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter writer = response.getWriter();
		writer.println("你的name："+username+"  <br> 密碼： "+password);
		writer.print("<form action=End.do method=post>");
		writer.print("<input type=submit value=OK  />");
		writer.print("</form>");
//		out.println("<form action='End' method='get'>");//也可以用action='#'
//		out.println("<input type='submit' value='OK'>");
		
//		out.println(LocalDateTime.now());
//		out.println("<input type = 'button' onclick='javascript:location.href='http://localhost:8080/0731/hello2'");
//		out.println("<input type='submit'>");
//		out.println(LocalDateTime.now());
		out.println("</body>");
		
		out.println("</html>");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
