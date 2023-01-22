package com.servlets;

import java.io.IOException;

import javax.servlet.*;
public class FirstServlet implements Servlet{

	@Override
	public void destroy() {
		System.out.println("going to destroy");
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "this servlet is created by Suyash Tiwari";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Suyash............");
		// TODO Auto-generated method stub
		
	}
	
	

}
