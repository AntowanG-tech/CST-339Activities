package com.gcu.business;

import java.util.List;

import com.gcu.model.OrderModel;

public interface OrdersBusinessInterface {
	
	public void test();
	
	public List<OrderModel> getOrders();
	
	public OrderModel getOrderById(String id);
	
	public void init();
	
	public void destroy();

}
