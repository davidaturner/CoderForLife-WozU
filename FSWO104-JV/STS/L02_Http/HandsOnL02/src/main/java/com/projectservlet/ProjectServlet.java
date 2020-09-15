package com.projectservlet;

import java.io.IOException;

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
	private static final long serialVersionUID = 1L;
	
	public void init() throws ServletException {
		super.init();
	}
	
	public void destroy() {
		super.destroy();
	}
	
	//CRUD
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.getWriter().append("GET is used to read information information.\r\n");
		
		processTestHeaderData(request, response, "GET");
		System.out.println("GET was called.");
	}
	
	private void processTestHeaderData(HttpServletRequest request, HttpServletResponse response, String str) {
		
		String testHeaderData = request.getHeader("Payload-Data");
		String testHeaderDataResponse = str + " ";
		
		if (testHeaderData == null || testHeaderData.isEmpty()) {
			testHeaderDataResponse += "nothing";
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		} else {
			testHeaderDataResponse += testHeaderData;
			response.setStatus(HttpServletResponse.SC_OK);
		}

		try {
			response.getWriter().append(testHeaderDataResponse);			
		} catch (IOException io) {
			System.out.println("Unable to write to response.");	
		}
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.getWriter().append("Data can be created using this method (POST).\r\n");		
		
		processTestHeaderData(request, response, "POST");
		System.out.println("POST was called.");
	}
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.getWriter().append("Use this (PUT) to update information.\r\n");
		
		processTestHeaderData(request, response, "PUT");
		System.out.println("PUT was called.");
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.getWriter().append("Only use DELETE to remove the specified target.\r\n");
		
		processTestHeaderData(request, response, "DELETE");
		System.out.println("DELETE was called.");
	}

}
