package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.OrderDataService;
import com.gcu.data.entity.OrderEntity;
import com.gcu.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessInterface{
	
	@Autowired
	OrderDataService service;

	@Override
	public void test() {
		// Simply prints "hello" to the console in order to test the interface's functionality
		System.out.println("Hello");
		
	}

	@Override
	public List<OrderModel> getOrders() {
		
		//Get all the Entity Orders
		List<OrderEntity> ordersEntity = service.findAll();
		
		//Iterate over the Entity Orders and create a list of Domain Orders
		List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
		for(OrderEntity entity : ordersEntity) {
			ordersDomain.add(new OrderModel(entity.getId(), entity.getOrderNo(), entity.getProductName(), entity.getPrice(), entity.getQuantity()));
		} 
		
				
		//Print orders to the console
				for (OrderModel orderMod : ordersDomain) {
					System.out.println(orderMod.toString());
				}
		
		//return List of Domain Orders
		return ordersDomain;
		
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Init() test message OrdersBusinessService");
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy() test message OrdersBusinessService");
		
	}
	
	
	

}
