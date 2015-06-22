/**
 * AutoIncOrderProcessSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.autoinc.order.process.autoincorderprocess;

import com.autoinc.businessControler.AutoIncFactoryControler;
import com.autoinc.businessControler.AutoIncFactoryControlerImpl;
import com.autoinc.dao.CustomerDAO;
import com.autoinc.dao.DeliveryOffersDAO;
import com.autoinc.dao.PurchaseDAO;
import com.autoinc.dao.UserDAO;
import com.autoinc.util.FactoryException;

/**
 * AutoIncOrderProcessSkeleton java skeleton for the axisService
 */
public class AutoIncOrderProcessSkeleton {
	AutoIncFactoryControler controler = new AutoIncFactoryControlerImpl();

	/**
	 * Auto generated method signature
	 * 
	 * @param updateOrder
	 * @return updateOrderResponse
	 */

	public com.autoinc.order.process.autoincorderprocess.UpdateOrderResponse updateOrder(
			com.autoinc.order.process.autoincorderprocess.UpdateOrder updateOrder) {
		UpdateOrderResponse response = new UpdateOrderResponse();
		PurchaseDAO createdOrder = null;
		try {
			createdOrder = controler.updateOrder(updateOrder.getOrderid(),
					updateOrder.getCustomerid(), updateOrder.getProductid(),
					updateOrder.getQuantity(), updateOrder.getSupplierid(),
					updateOrder.getTotalcost());
		} catch (FactoryException e) {
		}
		if (createdOrder != null) {
			Product product = new Product();
			product.setBrand(createdOrder.getProduct().getBrand());
			product.setColor(createdOrder.getProduct().getColor());
			product.setImageurl(createdOrder.getProduct().getImageurl());
			product.setManufacturer(createdOrder.getProduct().getManufacturer());
			product.setModelNumber(createdOrder.getProduct().getModelnumber());
			product.setPrice(createdOrder.getProduct().getPrice());
			product.setProductid(createdOrder.getProduct().getProductId());

			Address address = new Address();
			address.setAddressId(createdOrder.getCustomer().getAddress()
					.getId());
			address.setAddressline1(createdOrder.getCustomer().getAddress()
					.getAddLine1());
			address.setAddressline2(createdOrder.getCustomer().getAddress()
					.getAddLine2());
			address.setCity(createdOrder.getCustomer().getAddress().getCity());
			address.setCountry(createdOrder.getCustomer().getAddress()
					.getCountry());

			Customer customer = new Customer();
			customer.setAddressId(address);
			customer.setContactnum(createdOrder.getCustomer()
					.getContactNumber());
			customer.setName(createdOrder.getCustomer().getName());
			customer.setUserId(createdOrder.getCustomer().getUser().getId());

			Order order = new Order();
			order.setCustomerid(customer);
			order.setOrderId(createdOrder.getId());
			order.setOrderStatus(createdOrder.getOrderStatus());
			order.setProduct(product);
			order.setSupplier(createdOrder.getSupplier().getId());
			response.setUpdateOrderResponse(order);
		}
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param findCheapestSupplier
	 * @return findCheapestSupplierResponse
	 * @throws FindCheapestSupplierFault
	 */

	public com.autoinc.order.process.autoincorderprocess.FindCheapestSupplierResponse findCheapestSupplier(
			com.autoinc.order.process.autoincorderprocess.FindCheapestSupplier findCheapestSupplier)
			throws FindCheapestSupplierFault {
		FindCheapestSupplierResponse response = new FindCheapestSupplierResponse();

		DeliveryOffersDAO cheapestOffer = controler.findCheapestSupplier(
				findCheapestSupplier.getPreferencess());
		response.setSupplierId(cheapestOffer.getId());
		response.setTransportationCost(cheapestOffer.getCostPerUnit());
		response.setCustomerid(findCheapestSupplier.getCustomerid());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param createOrder
	 * @return createOrderResponse
	 * @throws CreateOrderFault
	 */

	public com.autoinc.order.process.autoincorderprocess.CreateOrderResponse createOrder(
			com.autoinc.order.process.autoincorderprocess.CreateOrder createOrder)
			throws CreateOrderFault {
		CreateOrderResponse response = new CreateOrderResponse();
		PurchaseDAO createdOrder;
		try {
			createdOrder = controler.createOrder(createOrder.getCustomerId(),
					createOrder.getProductId(), createOrder.getSupplierId(),
					createOrder.getTotalCost(),createOrder.getQuantity());
		} catch (FactoryException e) {
			CreateOrderFault ex = new CreateOrderFault();
			AutoIncOrderFault fault = new AutoIncOrderFault();
			AutoIncOrderException excep = new AutoIncOrderException();
			excep.setError("Cannot create order");
			fault.localAutoIncOrderFault=excep;
			ex.setFaultMessage(fault);
			throw ex;
		}

		Product product = new Product();
		product.setBrand(createdOrder.getProduct().getBrand());
		product.setColor(createdOrder.getProduct().getColor());
		product.setImageurl(createdOrder.getProduct().getImageurl());
		product.setManufacturer(createdOrder.getProduct().getManufacturer());
		product.setModelNumber(createdOrder.getProduct().getModelnumber());
		product.setPrice(createdOrder.getProduct().getPrice());
		product.setProductid(createdOrder.getProduct().getProductId());

		Address address = new Address();
		address.setAddressId(createdOrder.getCustomer().getAddress().getId());
		address.setAddressline1(createdOrder.getCustomer().getAddress()
				.getAddLine1());
		address.setAddressline2(createdOrder.getCustomer().getAddress()
				.getAddLine2());
		address.setCity(createdOrder.getCustomer().getAddress().getCity());
		address.setCountry(createdOrder.getCustomer().getAddress().getCountry());

		Customer customer = new Customer();
		customer.setAddressId(address);
		customer.setContactnum(createdOrder.getCustomer().getContactNumber());
		customer.setName(createdOrder.getCustomer().getName());
		customer.setUserId(createdOrder.getCustomer().getUser().getId());

		Order order = new Order();
		order.setCustomerid(customer);
		order.setOrderId(createdOrder.getId());
		order.setOrderStatus(createdOrder.getOrderStatus());
		order.setProduct(product);
		order.setSupplier(createdOrder.getSupplier().getId());
		response.setCreateOrderResponse(order);

		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param cancelOrder
	 * @return cancelOrderResponse
	 */

	public com.autoinc.order.process.autoincorderprocess.CancelOrderResponse cancelOrder(
			com.autoinc.order.process.autoincorderprocess.CancelOrder cancelOrder) {
		CancelOrderResponse response = new CancelOrderResponse();
		
		
		PurchaseDAO updatedOrder=null;
		try {
			updatedOrder = controler.cancleOrder(Integer.parseInt(cancelOrder.getOrderId()));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (FactoryException e) {
			e.printStackTrace();
		}
		response.setCancleStatus(updatedOrder.getOrderStatus());
		response.setOrderid(updatedOrder.getId()+"");
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param registerUser
	 * @return registerUserResponse
	 * @throws RegisterUserFault
	 */

	public com.autoinc.order.process.autoincorderprocess.RegisterUserResponse registerUser(
			com.autoinc.order.process.autoincorderprocess.RegisterUser registerUser)
			throws RegisterUserFault {
		RegisterUserResponse response = new RegisterUserResponse();

		UserDAO user =  controler.registerUser(registerUser.getUsername(), registerUser.getPassword(), registerUser.getRole(), registerUser.getEmail());
		User userToRetrurn = new User();
		
		userToRetrurn.setEmail(user.getEmailAddress());
		userToRetrurn.setId(user.getId());
		userToRetrurn.setPassword(user.getPassword());
		userToRetrurn.setRole(user.getRole());
		userToRetrurn.setUsername(user.getUserName());
		
		response.setRegisterUserResponse(userToRetrurn);

		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param updateOrderStatus
	 * @return updateOrderStatusResponse
	 * @throws UpdateOrderStatusFaultException
	 */

	public com.autoinc.order.process.autoincorderprocess.UpdateOrderStatusResponse updateOrderStatus(
			com.autoinc.order.process.autoincorderprocess.UpdateOrderStatus updateOrderStatus)
			throws UpdateOrderStatusFaultException {
		UpdateOrderStatusResponse response = new UpdateOrderStatusResponse();
		response.setOrderToken(updateOrderStatus.getOrderToken());
		try {
			response.setCurrentStatus(controler.updateOrderStatus(updateOrderStatus.getOrderId()).getOrderStatus());
		} catch (FactoryException e) {
			throw new UpdateOrderStatusFaultException("Failure in updateOrderStatus. Invalid status update");
		}
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param showtotalCost
	 * @return showtotalCostResponse
	 * @throws ShowtotalCostFault
	 */

	public com.autoinc.order.process.autoincorderprocess.ShowtotalCostResponse showtotalCost(
			com.autoinc.order.process.autoincorderprocess.ShowtotalCost showtotalCost)
			throws ShowtotalCostFault {
		ShowtotalCostResponse response = new ShowtotalCostResponse();

		response.setTotalCost(controler.showTotalCost(
				showtotalCost.getProductId(), showtotalCost.getTransportationcost()));
		response.setCustomerid(showtotalCost.getCustomerid());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param registerCustomer
	 * @return registerCustomerResponse
	 * @throws RegisterCustomerFault
	 */

	public com.autoinc.order.process.autoincorderprocess.RegisterCustomerResponse registerCustomer(
			com.autoinc.order.process.autoincorderprocess.RegisterCustomer registerCustomer)
			throws RegisterCustomerFault {
		RegisterCustomerResponse response = new RegisterCustomerResponse();
		CustomerDAO registeredCustomer = controler.registerCustomer(
				registerCustomer.getUserId(),
				registerCustomer.getCustomerName(),
				registerCustomer.getContactNo(), registerCustomer.getCity(),
				registerCustomer.getCountry(), registerCustomer.getZipcode(),
				registerCustomer.getAddline1(), registerCustomer.getAddline2());

		Customer customerToReturn = new Customer();

		Address address = new Address();
		address.setAddressId(registeredCustomer.getAddress().getId());
		address.setAddressline1(registeredCustomer.getAddress().getAddLine1());
		address.setAddressline2(registeredCustomer.getAddress().getAddLine2());
		address.setCity(registeredCustomer.getAddress().getCity());
		address.setCountry(registeredCustomer.getAddress().getCountry());

		customerToReturn.setAddressId(address);
		customerToReturn.setContactnum(registeredCustomer.getContactNumber());
		customerToReturn.setName(registeredCustomer.getName());
		customerToReturn.setUserId(registeredCustomer.getUser().getId());
		customerToReturn.setCustomerid(registeredCustomer.getId());

		response.setRegisterCustomerResponse(customerToReturn);
		return response;
	}

}
