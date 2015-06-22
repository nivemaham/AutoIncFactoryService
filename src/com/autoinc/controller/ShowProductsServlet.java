package com.autoinc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.autoinc.businessControler.AutoIncFactoryControlerImpl;
import com.autoinc.dao.ProductDAO;

public class ShowProductsServlet extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		try {
			HttpSession session = request.getSession(true);
			AutoIncFactoryControlerImpl ab=new AutoIncFactoryControlerImpl();
			List<ProductDAO> products = ab.showProducts();
			request.setAttribute("products", products);
			session.setAttribute("found", true);
			RequestDispatcher dispatcher;
			dispatcher=request.getRequestDispatcher("/CheckOutResponse.jsp");
			dispatcher.forward(request, response);
		}
		catch (Exception e) {
			 
	            e.printStackTrace();
	        }
	}
}
