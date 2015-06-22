package com.autoinc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.autoinc.order.OrderProcessServiceStub;
import com.autoinc.order.OrderProcessServiceStub.ConfirmOrder;
import com.autoinc.order.ProcessFaultException;

public class OrderProcessingServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String productId = request.getParameter("productId");
		String quantity = request.getParameter("quantity");
		String preference = request.getParameter("totalCost");
		String customerId = request.getParameter("customerId");
		String supplierId = request.getParameter("supplierId");
		String paymentMethod = request.getParameter("paymentMethod");
		String paymentNumber = request.getParameter("paymentNumber");
		

		System.out.println("test" + productId + " " + quantity + " "
				+ preference+" "+customerId+ " "+ supplierId+" "+paymentMethod+" "+paymentNumber);
		System.out.println("test" + productId + " " + quantity + " "
				+ preference);
		//
//		OrderProcessServiceStub stub = new OrderProcessServiceStub(null,
//				"http://localhost:8080/ode/processes/OrderProcess");
//		ConfirmOrder orderReq = new ConfirmOrder();
//		orderReq.setCardnumber(paymentNumber);
//		orderReq.setCustomerid(customerId);
//		orderReq.setPaymentmethod(paymentMethod);
//		orderReq.setProductid(productId);
//		orderReq.setQuantity(quantity);
//		orderReq.
//		stub.confirmOrder(confirmOrder0)
//		try {
//			availability = stub.process(totalCost);
//			request.setAttribute("availability", availability);
//			System.out.println("test "
//					+ availability.getOrderProcessResponse().getTotalcost());
//		} catch (ProcessFaultException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		//
//		request.setAttribute("productId", productId);
//		request.setAttribute("quantity", quantity);
//
//		// session.setAttribute("customerid", );
//		RequestDispatcher dispatcher;
//		dispatcher = request.getRequestDispatcher("/FindTotalCostResponse.jsp");
//		dispatcher.forward(request, response);
	}

}
