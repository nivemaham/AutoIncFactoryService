package com.autoinc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;

import com.autoinc.businessControler.AutoIncFactoryControlerImpl;
import com.autoinc.dao.UserDAO;
import com.autoinc.order.process.autoincorderprocess.AutoIncOrderProcessStub;
import com.autoinc.util.*;
/**
 * Servlet implementation class AutoIncFactoryLoginServlet
 */
@WebServlet("/AutoIncFactoryLoginServlet")
public class AutoIncFactoryLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutoIncFactoryLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AutoIncOrderProcessStub stub 
        = new AutoIncOrderProcessStub(null,
          "http://localhost:8081/AutoIncFactoryService/services/AutoIncOrderProcess");	
		try {
			HttpSession session = request.getSession(true);
			String userName=request.getParameter("userName");
		    String password=request.getParameter("password");
			AutoIncFactoryControlerImpl ab=new AutoIncFactoryControlerImpl();
			boolean val=ab.validate(userName, password);
			
			System.out.println("value is "+val);
			  //response.sendRedirect("Success");
		if (val==true)
		{ session.setAttribute("name", userName);
			String message="login is done";
		request.setAttribute("message", message);
		System.out.println(message);
		}
	RequestDispatcher dispatcher;
	dispatcher=request.getRequestDispatcher("/Signup.jsp");
	dispatcher.forward(request, response);
		
		}
		catch (Exception e) {
			 
	            e.printStackTrace();
	        }
		
	}
}
