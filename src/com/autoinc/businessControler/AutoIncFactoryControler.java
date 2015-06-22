package com.autoinc.businessControler;

import java.util.List;

import com.autoinc.bdo.AvailabilityResponse;
import com.autoinc.bdo.Product;
import com.autoinc.bdo.ProductDetails;
import com.autoinc.dao.CustomerDAO;
import com.autoinc.dao.DeliveryOffersDAO;
import com.autoinc.dao.ProductDAO;
import com.autoinc.dao.ProductDetailsDAO;
import com.autoinc.dao.PurchaseDAO;
import com.autoinc.dao.UserDAO;
import com.autoinc.dao.WarehouseDAO;
import com.autoinc.util.FactoryException;

public interface AutoIncFactoryControler {
	
	enum ORDER_STATUS{STARTED, CONFIRMED, SHIPPING, COMPLETED, CANCELLED}
	
	enum TRANSPORTATION_STATUS{CONFIRM_PICKUP, DISPATCHED, DELIVERED, CANCELLED}
	List<ProductDAO> showProducts();
	
	ProductDetailsDAO viewProductDetails(int productId);
	
	AvailabilityResponse checkProductAvailablity(int productId, String deliveryLocation);
	
	UserDAO registerUser(String username, String password, String role, String emailaddress);
	
	CustomerDAO registerCustomer(int userId,String name,int contactNo,String city,String country,String zipcode,String addLine1,String addLine2);

	List<String> showTransportationTypes();
	
	DeliveryOffersDAO findCheapestSupplier(String preference);
	
	double showTotalCost(int productId, float transportationCost);
	
	WarehouseDAO findClosestWarehouse(String deliveryLocation);
	
	WarehouseDAO findAlternativeWarehouse(int warehouseId);
	
	PurchaseDAO createOrder(int customerId, int productId,
			int supplierId, double totalCost, int quantity) throws FactoryException;

	List<PurchaseDAO> viewOrders();
	
	PurchaseDAO updateOrder(int orderid, int customerid, int productid, int quantity,int supplierid, double totalcost )throws FactoryException;
	
	PurchaseDAO updateOrderStatus(int orderid)throws FactoryException;
	
	PurchaseDAO cancleOrder(int orderId) throws FactoryException;
	
	boolean validate(String userName, String password);
}
