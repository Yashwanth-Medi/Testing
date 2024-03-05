package com.capstone.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderDetails {
	@Id
	@GeneratedValue
	private Long orderDetailsId;
	private Long user_Id;
	private Long productId;
	private Long orderId;
	
	
	public Long getOrderDetailsId() {
		return orderDetailsId;
	}


	public void setOrderDetailsId(Long orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}


	public Long getUser_Id() {
		return user_Id;
	}


	public void setUser_Id(Long user_Id) {
		this.user_Id = user_Id;
	}


	public Long getProductId() {
		return productId;
	}


	public void setProductId(Long productId) {
		this.productId = productId;
	}


	public Long getOrderId() {
		return orderId;
	}


	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}


	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
