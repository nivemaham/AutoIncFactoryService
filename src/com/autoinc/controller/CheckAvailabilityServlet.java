package com.autoinc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.autoinc.order.CheckAvailabilityFaultException;
import com.autoinc.order.OrderProcessServiceStub;
import com.autoinc.order.OrderProcessServiceStub.CheckAvailability;
import com.autoinc.order.OrderProcessServiceStub.CheckAvailabilityResponse;

public class CheckAvailabilityServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String productId=request.getParameter("productId");
		String quantity=request.getParameter("quantity");
		
		System.out.println("test" +productId+ " "+quantity);
		
		OrderProcessServiceStub stub = new OrderProcessServiceStub(null, "http://localhost:8080/ode/processes/OrderProcess");
		CheckAvailability checkAvailability = new CheckAvailability();
		checkAvailability.setCustomerid("TestCustomer");
		checkAvailability.setProductId(Integer.parseInt(productId));
		checkAvailability.setQuantity(Integer.parseInt(quantity));
		try {
			CheckAvailabilityResponse availability = stub.checkAvailability(checkAvailability);
			request.setAttribute("availability", availability);
			System.out.println("test "+availability.getAvailabilityType());
		} catch (CheckAvailabilityFaultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("productId", productId);
		request.setAttribute("quantity", quantity);
		
//		session.setAttribute("customerid", );
		RequestDispatcher dispatcher;
		dispatcher=request.getRequestDispatcher("/CheckAvailabilityResponse.jsp");
		dispatcher.forward(request, response);
//		String userName=request.getParameter("userName");
//		String password=request.getParameter("password");
//		 try {
//			 HttpSession session = request.getSession(true);
//             AutoIncOrderProcessStub stub 
//                = new AutoIncOrderProcessStub(null,
//                  "http://localhost:8081/AutoIncFactoryService/services/AutoIncOrderProcess");
//              //Create the request document to be sent.
//             AutoIncOrderProcessStub.RegisterUser u=new AutoIncOrderProcessStub.RegisterUser();
//             u.setEmail(emailAddress);
//             u.setPassword(password);
//             u.setRole(role);
//             u.setUsername(userName);
//             AutoIncOrderProcessStub.RegisterUserResponse resp= new AutoIncOrderProcessStub.RegisterUserResponse();
//           
//			resp=stub.registerUser(u);
//			
//		session.setAttribute("name", userName);
//		String message="data inserted successfully";
//		request.setAttribute("message", message);
//		System.out.println(message);
//		RequestDispatcher dispatcher;
//		dispatcher=request.getRequestDispatcher("/LogIn.jsp");
//		dispatcher.forward(request, response);
//			
//			
//			System.out.println(resp.toString());
//		
//             } 
//	     catch (java.rmi.RemoteException e) {
//                e.printStackTrace();
//        } catch (RegisterUserFault e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}