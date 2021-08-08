package com.gcu.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("ORDERS")
public class OrderEntity {
	
	@Id
	private Long id;
	
	@Column("ORDER_NO")
	private String orderNo;
	
	@Column("PRODUCT_NAME")
	private String productName;
	
	@Column("PRICE")
	private Float price;
	
	@Column("QUANTITY")
	private int quantity;
	
	public OrderEntity(Long id, String orderNo, String productName, Float price, int quantity) {
		
		this.id = id;
		this.orderNo = orderNo;
		this.price = price;
		this.productName = productName;
		this.quantity = quantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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

}
