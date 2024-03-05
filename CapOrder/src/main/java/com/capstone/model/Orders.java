package com.capstone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Orders {
	@Id
	@GeneratedValue
	private Long orderId;

	private String orderAmount;

	private String orderCustomerName;

	private String orderCustomerAddress;

	private String orderCustomerEmail;

	private String orderCustomerPhone;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderCustomerName() {
		return orderCustomerName;
	}

	public void setOrderCustomerName(String orderCustomerName) {
		this.orderCustomerName = orderCustomerName;
	}

	public String getOrderCustomerAddress() {
		return orderCustomerAddress;
	}

	public void setOrderCustomerAddress(String orderCustomerAddress) {
		this.orderCustomerAddress = orderCustomerAddress;
	}

	public String getOrderCustomerEmail() {
		return orderCustomerEmail;
	}

	public void setOrderCustomerEmail(String orderCustomerEmail) {
		this.orderCustomerEmail = orderCustomerEmail;
	}

	public String getOrderCustomerPhone() {
		return orderCustomerPhone;
	}

	public void setOrderCustomerPhone(String orderCustomerPhone) {
		this.orderCustomerPhone = orderCustomerPhone;
	}

	public Orders(Long orderId, String orderAmount, String orderCustomerName, String orderCustomerAddress,
			String orderCustomerEmail, String orderCustomerPhone) {
		super();
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.orderCustomerName = orderCustomerName;
		this.orderCustomerAddress = orderCustomerAddress;
		this.orderCustomerEmail = orderCustomerEmail;
		this.orderCustomerPhone = orderCustomerPhone;
	}

}
