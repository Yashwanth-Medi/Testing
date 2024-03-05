package com.capstone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.Model.OrderDetails;
import com.capstone.helper.Responeobjects;


@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Long> {
	
	
//	public Responeobjects orderDetails(Long orderDetailsId);

}
