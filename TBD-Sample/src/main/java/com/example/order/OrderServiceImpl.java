package com.example.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.example.demo.LabService;

public class OrderServiceImpl {

	@Autowired
	private final OrderRepository orderRepository;
    private final LabService labService;
    private final AmazonSQS sqsClient;
    
//    OrderStatus orderStatus = new OrderStatus("PENDING_FULFILL");

    @Value("${sqs.inbound_order.url}")
    private String inboundOrderQueueUrl;

    public OrderServiceImpl(OrderRepository orderRepository, LabService labService, AmazonSQS sqsClient) {
        this.orderRepository = orderRepository;
        this.labService = labService;
        this.sqsClient = sqsClient;
        
    }
    
    

    
    public Order createOrder(Order order) {
        order.setOrderStatus(OrderStatus.PENDING_FULFILL);
        Order createdOrder = orderRepository.save(order);
        sendMessageToInboundOrderQueue(createdOrder.getId());
        return createdOrder;
    }

    
    public void updateOrderStatus(Long orderId, OrderStatus status) {
        Order order = getOrderById(orderId);
        order.setOrderStatus(status);
        orderRepository.save(order);
    }

    private Order getOrderById(Long orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow() ;
    }

    private void sendMessageToInboundOrderQueue(Long orderId) {
        String message = String.format("{\"orderId\": %d}", orderId);
        SendMessageRequest request = new SendMessageRequest()
                .withQueueUrl(inboundOrderQueueUrl)
                .withMessageBody(message);
        sqsClient.sendMessage(request);
    }
    
   
    
    
    
    
    
}
