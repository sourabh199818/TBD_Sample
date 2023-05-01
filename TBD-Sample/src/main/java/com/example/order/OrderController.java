package com.example.order;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.WebhookEvent;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	
	    private final OrderService orderService;

	    public OrderController(OrderService orderService) {
	        this.orderService = orderService;
	    }

	    @PostMapping
	    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
	        Order createdOrder = orderService.createOrder(order);
	        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
	    }

	    @PostMapping("/webhook")
	    public void handleWebhookEvent(@RequestBody WebhookEvent event) {
	        if ("order_shipped".equals(event.getType())) {
	            orderService.updateOrderStatus(event.getOrderId(), OrderStatus.SHIPPED);
	        } else if ("customer_received".equals(event.getType())) {
	            orderService.updateOrderStatus(event.getOrderId(), OrderStatus.RECEIVED);
	        } else if ("sample_received".equals(event.getType())) {
	            orderService.updateOrderStatus(event.getOrderId(), OrderStatus.SAMPLE_RECEIVED);
	        } else if ("results_ready".equals(event.getType())) {
	            orderService.updateOrderStatus(event.getOrderId(), OrderStatus.RESULTS_READY);
	        }
	    }

	}


