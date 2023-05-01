package com.example.order;

public interface OrderService {
	
	
	Order createOrder(Order order);

    void updateOrderStatus(Long orderId, OrderStatus status);
	
	

}
