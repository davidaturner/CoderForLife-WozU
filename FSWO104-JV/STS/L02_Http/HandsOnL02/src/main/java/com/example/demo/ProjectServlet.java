package com.example.demo;

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
	private static final long serialVersionUID = 2361585011424435175L;

	public void init() throws ServletException {
		super.init();
	}
	
	public void destroy() {
		super.destroy();
	}
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	String responseText = "GET is used to read information information."; 
        response.getWriter().append(responseText);
        
        String consoleText = "GET was called.";  
        String payloadData = request.getHeader("Payload-Data");
    	consoleText += (payloadData != null)?"\r\n" + payloadData : "";   
    	
        System.out.println(consoleText);
        
        response.setStatus(HttpServletResponse.SC_OK);
        System.out.println(response.getStatus());

    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String responseText = "Data can be created using this method (POST).";       		
        response.getWriter().append(responseText);
        
        String consoleText = "POST was called.";  
        String payloadData = request.getHeader("Payload-Data");
    	consoleText += (payloadData != null)?"\r\n" + payloadData : "";   
    	
        System.out.println(consoleText);
        
        response.setStatus(HttpServletResponse.SC_OK);
        System.out.println(response.getStatus());
    }
    
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String responseText = "Use this (PUT) to update information.";       		
        response.getWriter().append(responseText);
        
        String consoleText = "PUT was called.";  
        String payloadData = request.getHeader("Payload-Data");
    	consoleText += (payloadData != null)?"\r\n" + payloadData : "";   
    	
        System.out.println(consoleText);
        
        response.setStatus(HttpServletResponse.SC_OK);
        System.out.println(response.getStatus());
    }
    
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String responseText = "Only use DELETE to remove the specified target.";       		
        response.getWriter().append(responseText);
        
        String consoleText = "DELETE was called.";  
        String payloadData = request.getHeader("Payload-Data");
    	consoleText += (payloadData != null)?"\r\n" + payloadData : "";   
    	
        System.out.println(consoleText);
        
        response.setStatus(HttpServletResponse.SC_OK);
        System.out.println(response.getStatus());
    }
}
