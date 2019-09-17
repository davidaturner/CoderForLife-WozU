package org.codercamps.FSWO1043JV.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// init
	public void init() throws ServletException {
		super.init();
	}
	
	// destroy
	public void destroy() {
		super.destroy();
	}
	
	// create
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("a doPost() was called.");
	}
	
	// read
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		
		String testheaderRequest = request.getHeader("testheader");
		String testheaderResponse = "nothing";
		
		if (testheaderRequest != null && !testheaderRequest.isEmpty()) {
			System.out.println("test header found!");
			testheaderResponse =  testheaderRequest;
		} else {
			System.out.println("test header missing!");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		
		String responseText = "You sent " + testheaderResponse + " to the server. ";

		// writes the text to the response.
		response.getWriter().append(responseText);
		
		System.out.println("a doGet() was called.");
	}
	
	// update
	protected void doPut(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("a doPut() was called.");
	}
	
	// delete
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("a doDelete() was called.");
	}
	
}
