package simpleservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8303699064575138297L;

	public void init() throws ServletException {
		super.init();
	}
	
	public void destroy() {
		super.destroy();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		System.out.println("a doGet() was called");
		String testHeaderContent = request.getHeader("Test-Header");
		if (testHeaderContent == null || testHeaderContent.isEmpty()) {
			testHeaderContent = "nothing";
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		PrintWriter out = response.getWriter();
		out.println("This is " + testHeaderContent + " sent.");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		System.out.println("a doPost() was called");
	}
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		System.out.println("a doPut() was called");
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		System.out.println("a doDelete() was called");
	}
}
