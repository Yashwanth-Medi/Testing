package com.capstone.helper;

import com.capstone.Model.OrderDetails;

public class Responeobjects {

	private OrderDetails orderDetails;

	private Product product;

	private Orders orders;
	
	private userAuth  auth;

	public OrderDetails getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public userAuth getAuth() {
		return auth;
	}

	public void setAuth(userAuth auth) {
		this.auth = auth;
	}

	public Responeobjects() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
