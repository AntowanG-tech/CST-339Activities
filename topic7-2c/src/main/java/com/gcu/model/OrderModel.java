package com.gcu.model;



public class OrderModel {
	
	
	String id = "";
    String orderNo = "";
	String productName = "";
	float price = 0;
	int quantity = 0;
	
	public OrderModel() {
		
		this.id = "";
		this.orderNo = "";
		this.productName = "";
		this.price = 0;
		this.quantity = 0;
		
	}
	
	public OrderModel(String id, String orderNo, String productName, Float price, int quantity) {
		
		
		this.id = id;
		this.orderNo = orderNo;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("Order Number: " + orderNo + "\n" + "Product Name: " + productName + "\n" + "Price: " + price + "\n" + "Quantity: " + quantity + "\n");
		return super.toString();
	}
	
	
	
	
}
