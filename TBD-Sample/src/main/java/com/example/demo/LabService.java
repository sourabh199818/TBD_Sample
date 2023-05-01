package com.example.demo;

import com.example.order.Order;

public interface LabService {
	
	  void placeOrder(Order order);
	    void updateOrderStatus(Long orderId, String status);

}
