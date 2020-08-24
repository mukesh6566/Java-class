package com.durga.tech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Test implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method is called");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Object of Servlet is created");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String num1=req.getParameter("num1");
		String num2=req.getParameter("num2");
		   PrintWriter out=res.getWriter();
	    int sum=Integer.parseInt(num1)+Integer.parseInt(num2);
	    if(Integer.parseInt(num1)>Integer.parseInt(num2))
	    {
	    	out.print("Num1 is greater");
	    }
	    else
	    {
	    	out.print("Num2 is greater");
	    }
	    ///How to send response to client
	 
	    out.print("Sum="+sum);
		
	}

}
