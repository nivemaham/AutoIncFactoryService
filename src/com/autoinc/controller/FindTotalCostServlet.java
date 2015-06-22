package com.autoinc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.autoinc.order.OrderProcessServiceStub;
import com.autoinc.order.ProcessFaultException;

public class FindTotalCostServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productId=request.getParameter("productId");
		String quantity=request.getParameter("quantity");
		String preference=request.getParameter("deliveryMode");
		
		System.out.println("test" +productId+ " "+quantity+" "+ preference);
		System.out.println("test" +productId+ " "+quantity+" "+ preference);
//		
		OrderProcessServiceStub stub = new OrderProcessServiceStub(null, "http://localhost:8080/ode/processes/OrderProcess");
		OrderProcessServiceStub.OrderProcessRequest totalCost = new OrderProcessServiceStub.OrderProcessRequest();
		totalCost.setCustomerid("TestCustomer");
		totalCost.setProductId(Integer.parseInt(productId));
		totalCost.setQuantity(Integer.parseInt(quantity));
		totalCost.setPreference(preference);
			OrderProcessServiceStub.OrderProcessResponse availability;
			try {
				availability = stub.process(totalCost);
				request.setAttribute("availability", availability);
				System.out.println("test "+availability.getOrderProcessResponse().getTotalcost());
			} catch (ProcessFaultException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//		
		request.setAttribute("productId", productId);
		request.setAttribute("quantity", quantity);
		
//		session.setAttribute("customerid", );
		RequestDispatcher dispatcher;
		dispatcher=request.getRequestDispatcher("/FindTotalCostResponse.jsp");
		dispatcher.forward(request, response);
	}
}
