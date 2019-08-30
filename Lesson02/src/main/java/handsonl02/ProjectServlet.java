package handsonl02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProjectServlet")
public class ProjectServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2653461562319685946L;

	public void init() throws ServletException {
		super.init();
	}
	
	public void destroy() {
		super.destroy();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		String headerDataContent = request.getHeader("Payload-Data");
		if (headerDataContent == null || headerDataContent.isEmpty()) {
			headerDataContent = "Missing Payload-Data. Bad Request.";
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		} else {
			PrintWriter out = response.getWriter();
			out.append("GET is used to read information information.");		
		}
		
		System.out.println("GET was called.");
		System.out.println(headerDataContent);	
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		String headerDataContent = request.getHeader("Payload-Data");
		if (headerDataContent == null || headerDataContent.isEmpty()) {
			headerDataContent = "Missing Payload-Data. Bad Request.";
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		} else {
			PrintWriter out = response.getWriter();
			out.append("Data can be created using this method (POST).");
		}			
		System.out.println("POST was called.");
		System.out.println(headerDataContent);	
	}
	
	public void doPut(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		String headerDataContent = request.getHeader("Payload-Data");
		if (headerDataContent == null || headerDataContent.isEmpty()) {
			headerDataContent = "Missing Payload-Data. Bad Request.";
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		} else {
			PrintWriter out = response.getWriter();
			out.append("Use this (PUT) to update information.");			
		}
		System.out.println("PUT was called.");
		System.out.println(headerDataContent);
	}
	
	public void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		String headerDataContent = request.getHeader("Payload-Data");
		if (headerDataContent == null || headerDataContent.isEmpty()) {
			headerDataContent = "Missing Payload-Data. Bad Request.";
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		} else {
			PrintWriter out = response.getWriter();
			out.append("Only use DELETE to remove the specified target.");
		
		}			
		System.out.println("DELETE was called.");
		System.out.println(headerDataContent);
	}
}
