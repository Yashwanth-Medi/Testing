package com.capstone.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capstone.Model.OrderDetails;
import com.capstone.Repository.OrderDetailsRepository;
import com.capstone.helper.Orders;
import com.capstone.helper.Product;
import com.capstone.helper.Responeobjects;
import com.capstone.helper.userAuth;

@Service
public class OrderDetailService {
	
	
	@Autowired
	private OrderDetailsRepository detailsRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	public OrderDetails newOrder(OrderDetails orderDetails) {
		return detailsRepository.save(orderDetails);
		
	}
	
	public  Responeobjects orderDetails(Long orderDetailsId) {
		
		Responeobjects vo= new Responeobjects();
		
		OrderDetails orderDetails=detailsRepository.findById(orderDetailsId).orElseThrow(IllegalArgumentException::new);
		
		
		//product service maping
		Product product=restTemplate.getForObject("http://localhost:9003/product/" + orderDetails.getProductId(), 
				Product.class);
		//order service mapping
		Orders orders=restTemplate.getForObject("http://localhost:9002/orders/" + orderDetails.getOrderId(), Orders.class);
		
		userAuth auth=restTemplate.getForObject("http://localhost:9001/auth/" + orderDetails.getUser_Id(), userAuth.class);
		
		vo.setOrderDetails(orderDetails);
		vo.setProduct(product);
		vo.setOrders(orders);
		vo.setAuth(auth);
		
		
		
		return vo;
		
	}

}
