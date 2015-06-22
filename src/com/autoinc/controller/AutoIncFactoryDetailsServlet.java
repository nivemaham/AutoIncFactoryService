package com.autoinc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.autoinc.businessControler.AutoIncFactoryControlerImpl;
import com.autoinc.dao.ProductDetailsDAO;

/**
 * Servlet implementation class AutoIncFactoryDetailsServlet
 */
public class AutoIncFactoryDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AutoIncFactoryDetailsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		try {
			HttpSession session = request.getSession(true);
			String s=request.getParameter("articleId");
			int idReceived=Integer.parseInt(s);
			AutoIncFactoryControlerImpl ab=new AutoIncFactoryControlerImpl();
			ProductDetailsDAO pd= ab.viewProductDetails(idReceived);
			request.setAttribute("product", pd);
			RequestDispatcher dispatcher;
			dispatcher=request.getRequestDispatcher("/Details.jsp");
			dispatcher.forward(request, response);
			
			
		
	
		
		}
		catch (Exception e) {
			 
	            e.printStackTrace();
	        }
	}
}
