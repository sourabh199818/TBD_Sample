package com.example.demo;

public enum WebhookEvent {
	    ORDER_CREATED("order_created"),
	    ORDER_UPDATED("order_updated"),
	    ORDER_CANCELLED("order_cancelled");

	    private final String type;
	    private Long orderId;

	    private WebhookEvent(String type) {
	        this.type = type;
	    }

	    public String getType() {
	        return this.type;
	    }
	    
	    
	    public Long getOrderId() {
	        return orderId;
	    }
	    
	    public void setOrderId(Long orderId) {
	        this.orderId = orderId;
	    }
}
