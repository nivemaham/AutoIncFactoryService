package com.autoinc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.autoinc.order.process.autoincorderprocess.AutoIncOrderProcessStub;
import com.autoinc.order.process.autoincorderprocess.RegisterUserFault;

/**
 * Servlet implementation class AutoIncFactoryCntrl
 */

public class AutoIncFactorySignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutoIncFactorySignupServlet() {
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
		
		String emailAddress=request.getParameter("emailAddress");
		String role=request.getParameter("role");
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		 try {
			 HttpSession session = request.getSession(true);
             AutoIncOrderProcessStub stub 
                = new AutoIncOrderProcessStub(null,
                  "http://localhost:8081/AutoIncFactoryService/services/AutoIncOrderProcess");
              //Create the request document to be sent.
             AutoIncOrderProcessStub.RegisterUser u=new AutoIncOrderProcessStub.RegisterUser();
             u.setEmail(emailAddress);
             u.setPassword(password);
             u.setRole(role);
             u.setUsername(userName);
             AutoIncOrderProcessStub.RegisterUserResponse resp= new AutoIncOrderProcessStub.RegisterUserResponse();
           
			resp=stub.registerUser(u);
			
		session.setAttribute("name", userName);
		String message="data inserted successfully";
		request.setAttribute("message", message);
		System.out.println(message);
		RequestDispatcher dispatcher;
		dispatcher=request.getRequestDispatcher("/LogIn.jsp");
		dispatcher.forward(request, response);
			
			
			System.out.println(resp.toString());
		
             } 
	     catch (java.rmi.RemoteException e) {
                e.printStackTrace();
        } catch (RegisterUserFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
		
		
	
		
	}

}
