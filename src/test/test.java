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
 * Servlet implementation class test
 */
@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
//		response.getWriter().append("GOGO!:").append(request.getContextPath());
		
		out.println("<!Doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("meta charset=UTF-8");
		out.println("<title>Servlet 範例文件111111</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("====================");
		out.println("<form action='info' method='get'>");//也可以用action='#'
		out.println("<input type='submit'>");
		out.println(LocalDateTime.now());
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
