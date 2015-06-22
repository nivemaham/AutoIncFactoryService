package com.autoinc.businessControler;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

import com.autoinc.bdo.AvailabilityResponse;
import com.autoinc.bdo.Product;
import com.autoinc.bdo.ProductDetails;
import com.autoinc.businessControler.AutoIncAdminControler.DELIVERY_SERVICE_LEVEL;
import com.autoinc.dao.AddressDAO;
import com.autoinc.dao.CustomerDAO;
import com.autoinc.dao.DeliveryOffersDAO;
import com.autoinc.dao.ProductDAO;
import com.autoinc.dao.ProductDetailsDAO;
import com.autoinc.dao.PurchaseDAO;
import com.autoinc.dao.SupplyLogisticsDAO;
import com.autoinc.dao.TransportationStatusDAO;
import com.autoinc.dao.UserDAO;
import com.autoinc.dao.WarehouseDAO;
import com.autoinc.util.FactoryException;
import com.autoinc.util.HibernateUtil;
import com.autoinc.util.HibernateUtilImpl;

public class AutoIncFactoryControlerImpl implements AutoIncFactoryControler {

	HibernateUtil hibernateUtil = new HibernateUtilImpl();

	@Override
	public List<ProductDAO> showProducts() {
		Session session = hibernateUtil.getSession();
		session.beginTransaction();

		@SuppressWarnings("unchecked")
		List<ProductDAO> listProd = (List<ProductDAO>) session
				.createCriteria(ProductDAO.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		session.getTransaction().commit();
		session.close();

		return listProd;
	}

	private List<Product> convertToProducts(List<ProductDAO> listProd) {
		List<Product> products = new ArrayList<>();
		for (ProductDAO prodDao : listProd) {
			products.add(new Product(prodDao));
		}
		return products;
	}

	@Override
	public ProductDetailsDAO viewProductDetails(int productId) {

		Session session = hibernateUtil.getSession();
		session.beginTransaction();
		ProductDetailsDAO productDetails = (ProductDetailsDAO) session.get(
				ProductDetailsDAO.class, productId);
		session.getTransaction().commit();
		session.close();

		return productDetails;
	}

	@Override
	public UserDAO registerUser(String username, String password, String role,
			String emailaddress) {
		Session session = hibernateUtil.getSession();
		session.beginTransaction();
		UserDAO user = new UserDAO(username, password, role, emailaddress);
		session.saveOrUpdate(user);
		session.getTransaction().commit();
		session.close();

		return user;

	}

	@Override
	public AvailabilityResponse checkProductAvailablity(int productId,
			String deliveryLocation) {

		WarehouseDAO warehouse = findClosestWarehouse(deliveryLocation);

		WarehouseDAO alternativewarehouse = findAlternativeWarehouse(warehouse
				.getId());

		System.out.println(alternativewarehouse.getAddress().getCountry());
		return null;
	}

	@Override
	public WarehouseDAO findAlternativeWarehouse(int warehouseId) {
		Session session = hibernateUtil.getSession();
		session.beginTransaction();

		@SuppressWarnings("unchecked")
		List<WarehouseDAO> listProd = (List<WarehouseDAO>) session
				.createCriteria(WarehouseDAO.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		WarehouseDAO warehouse = (WarehouseDAO) session.get(WarehouseDAO.class,
				warehouseId);
		session.getTransaction().commit();
		session.close();

		listProd.remove(warehouse);
		return listProd.get(0);
	}

	@Override
	public WarehouseDAO findClosestWarehouse(String deliveryLocation) {
		Session session = hibernateUtil.getSession();
		session.beginTransaction();

		String hql = "SELECT WH FROM AddressDAO E, WarehouseDAO WH WHERE WH.address = E.id and E.country=:addCountry";
		Query query = session.createQuery(hql);
		query.setParameter("addCountry", deliveryLocation.trim());
		WarehouseDAO results = (WarehouseDAO) query.uniqueResult();
		session.getTransaction().commit();
		session.close();

		return results;

	}

	@Override
	public CustomerDAO registerCustomer(int userId, String name, int contactNo,
			String city, String country, String zipcode, String addLine1,
			String addLine2) {

		Session session = hibernateUtil.getSession();
		session.beginTransaction();

		UserDAO userObj = (UserDAO) session.get(UserDAO.class, userId);
		AddressDAO address = new AddressDAO();

		address.setAddLine1(addLine1);
		address.setAddLine2(addLine2);
		address.setCity(city);
		address.setCountry(country);
		address.setZipcode(zipcode);

		CustomerDAO customer = new CustomerDAO();
		customer.setUser(userObj);
		customer.setName(name);
		customer.setAddress(address);
		customer.setContactNumber(contactNo);

		session.saveOrUpdate(userObj);
		session.saveOrUpdate(address);
		session.saveOrUpdate(customer);
		session.getTransaction().commit();
		session.close();

		return customer;
	}

	@Override
	public List<String> showTransportationTypes() {
		// TODO Auto-generated method stub
		List<String> transportationTypes = new ArrayList<String>();
		for (DELIVERY_SERVICE_LEVEL type : AutoIncAdminControler.DELIVERY_SERVICE_LEVEL
				.values()) {
			transportationTypes.add(type.toString());
		}
		return transportationTypes;
	}

	@Override
	public DeliveryOffersDAO findCheapestSupplier(String preference) {

		Session session = hibernateUtil.getSession();
		session.beginTransaction();

		String hql = "SELECT SUP FROM DeliveryOffersDAO SUP "
				+ "group by SUP.serviceLevel having SUP.serviceLevel in (:preference) and min(SUP.costPerUnit)<10000.0";
		Query query = session.createQuery(hql);
		query.setParameter("preference", preference.trim());
		DeliveryOffersDAO results = (DeliveryOffersDAO) query.uniqueResult();
		// System.out.println(" size "+results.size());
		session.getTransaction().commit();
		session.close();

		return results;
	}

	@Override
	public PurchaseDAO createOrder(int customerId, int productId,
			int supplierId, double totalCost, int quantity)
			throws FactoryException {
		PurchaseDAO newOrder = new PurchaseDAO();

		Session session = hibernateUtil.getSession();
		session.beginTransaction();

		CustomerDAO customer = (CustomerDAO) session.get(CustomerDAO.class,
				customerId);

		ProductDAO product = (ProductDAO) session.get(ProductDAO.class,
				productId);

		SupplyLogisticsDAO supplierObj = (SupplyLogisticsDAO) session.get(
				SupplyLogisticsDAO.class, supplierId);

		if (customer == null || product == null || supplierObj == null) {
			throw new FactoryException(
					"Error while retriving one or more of the related customer product or supplier details.");
		}

		newOrder.setCustomer(customer);
		newOrder.setProduct(product);
		newOrder.setSupplier(supplierObj);
		newOrder.setTotalCost(totalCost);
		newOrder.setOrderStatus(AutoIncFactoryControler.ORDER_STATUS.STARTED
				.toString());
		newOrder.setQuantity(quantity);

		session.save(newOrder);
		session.getTransaction().commit();
		session.close();

		return newOrder;
	}

	public List<PurchaseDAO> viewOrders() {
		Session session = hibernateUtil.getSession();
		session.beginTransaction();

		@SuppressWarnings("unchecked")
		List<PurchaseDAO> listProd = (List<PurchaseDAO>) session
				.createCriteria(PurchaseDAO.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		session.getTransaction().commit();
		session.close();

		return listProd;
	}

	@Override
	public double showTotalCost(int productId, float transportationCost) {
		Session session = hibernateUtil.getSession();
		session.beginTransaction();

		ProductDAO product = (ProductDAO) session.get(ProductDAO.class,
				productId);

		session.getTransaction().commit();
		session.close();

		return product.getPrice() + transportationCost;
	}

	@Override
	public PurchaseDAO updateOrder(int orderid, int customerid, int productid,
			int quantity, int supplierid, double totalcost)
			throws FactoryException {

		Session session = hibernateUtil.getSession();
		session.beginTransaction();

		PurchaseDAO newOrder = (PurchaseDAO) session.get(PurchaseDAO.class,
				customerid);
		if (newOrder != null
				&& !AutoIncFactoryControler.ORDER_STATUS.CANCELLED
						.equals(newOrder.getOrderStatus())
				&& !AutoIncFactoryControler.ORDER_STATUS.SHIPPING
						.equals(newOrder.getOrderStatus())
				&& !AutoIncFactoryControler.ORDER_STATUS.COMPLETED
						.equals(newOrder.getOrderStatus())) {
			CustomerDAO customer = (CustomerDAO) session.get(CustomerDAO.class,
					customerid);

			ProductDAO product = (ProductDAO) session.get(ProductDAO.class,
					productid);

			SupplyLogisticsDAO supplierObj = (SupplyLogisticsDAO) session.get(
					SupplyLogisticsDAO.class, supplierid);

			if (customer == null || product == null || supplierObj == null) {
				throw new FactoryException(
						"Error while retriving one or more of the related customer product or supplier details.");
			}

			newOrder.setCustomer(customer);
			newOrder.setProduct(product);
			newOrder.setSupplier(supplierObj);
			newOrder.setTotalCost(totalcost);
			newOrder.setQuantity(quantity);
			newOrder.setOrderStatus(AutoIncFactoryControler.ORDER_STATUS.STARTED
					.toString());

			session.saveOrUpdate(newOrder);
		}
		session.getTransaction().commit();
		session.close();

		return newOrder;
	}

	@Override
	public PurchaseDAO updateOrderStatus(int orderid) throws FactoryException {
		Session session = hibernateUtil.getSession();
		session.beginTransaction();

		PurchaseDAO order = (PurchaseDAO) session.get(PurchaseDAO.class,
				orderid);

		String hql = "SELECT TS FROM TransportationStatusDAO TS WHERE TS.orderDAO.id = :orderId";
		Query query = session.createQuery(hql);
		query.setParameter("orderId", orderid);

		List<TransportationStatusDAO> results = (List<TransportationStatusDAO>) query
				.list();

		String status = order.getOrderStatus();
		if (AutoIncFactoryControler.TRANSPORTATION_STATUS.DISPATCHED.toString()
				.equals(results.get(0).getShippingStatus())) {
			status = AutoIncFactoryControler.ORDER_STATUS.SHIPPING.toString();
		} else if (AutoIncFactoryControler.TRANSPORTATION_STATUS.DELIVERED
				.toString().equals(results.get(0).getShippingStatus())) {
			status = AutoIncFactoryControler.ORDER_STATUS.COMPLETED.toString();
		} else if (AutoIncFactoryControler.TRANSPORTATION_STATUS.CANCELLED
				.toString().equals(results.get(0).getShippingStatus())) {
			status = AutoIncFactoryControler.ORDER_STATUS.CANCELLED.toString();
		} else if (AutoIncFactoryControler.TRANSPORTATION_STATUS.CONFIRM_PICKUP
				.toString().equals(results.get(0).getShippingStatus())) {
			status = AutoIncFactoryControler.ORDER_STATUS.CONFIRMED.toString();
		}

		order.setOrderStatus(status);

		session.saveOrUpdate(order);
		session.getTransaction().commit();
		session.close();

		return order;
	}

	@Override
	public PurchaseDAO cancleOrder(int orderId) throws FactoryException {
		Session session = hibernateUtil.getSession();
		session.beginTransaction();

		PurchaseDAO order = (PurchaseDAO) session.get(PurchaseDAO.class,
				orderId);
		if (!order.getOrderStatus().equals(
				AutoIncFactoryControler.ORDER_STATUS.SHIPPING) && !order.getOrderStatus().equals(
						AutoIncFactoryControler.ORDER_STATUS.COMPLETED)&& !order.getOrderStatus().equals(
								AutoIncFactoryControler.ORDER_STATUS.CANCELLED)) {
			order.setOrderStatus(AutoIncFactoryControler.ORDER_STATUS.CANCELLED
					.toString());

			session.saveOrUpdate(order);
		}
		session.getTransaction().commit();
		session.close();
		return order;
	}
	
	@Override
	public boolean validate(String userName, String password) {
		// TODO Auto-generated method stub
		Session session = hibernateUtil.getSession();
		session.beginTransaction();
		String hql = "FROM UserDAO where userName=? and password=?";
		Query query = session.createQuery(hql);
		query.setString(0, userName);
		query.setString(1,password);
		List<UserDAO> user=query.list();
		if(user.size()>0)
		{
			System.out.println("heyy dere");
			return true;
		}
		
		return false;
	}
}
