package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.data.entity.OrderEntity;
import com.gcu.data.repository.OrdersRepository;
import com.gcu.model.OrderModel;

@Service
public class OrdersBusinessService {
	
	@Autowired
	OrdersRepository ordersRepository;
	
	/**
	 * Non-Default constructor for constructor injection
	 * 
	 */
	public OrdersBusinessService(OrdersRepository ordersRepository) {
		
		this.ordersRepository = ordersRepository;
		
	}
	
	/**
	 * Get all the Orders from the database.
	 * @return
	 */
	public List<OrderModel> getAllOrders() {
		
		//Get all the Entity Orders
		List<OrderEntity> ordersEntity = ordersRepository.findAll();
		
		//Option 2: Iterate over the Entity Orders and create a list of Domain Orders
		List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
		for(OrderEntity entity : ordersEntity) {
			
			ordersDomain.add(new OrderModel(entity.getId(), entity.getOrderNo(), entity.getProductName(), entity.getPrice(), entity.getQuantity()));
		}
		
		//Return List of Domain Orders
		return ordersDomain;
		
	}

}
