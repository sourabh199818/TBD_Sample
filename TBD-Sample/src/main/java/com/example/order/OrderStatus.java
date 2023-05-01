package com.example.order;

public enum OrderStatus {
	
	
	PENDING_FULFILL("Pending Fulfill"),
    FULFILLED("Fulfilled"),
    CANCELLED("Cancelled"),
    SENT_TO_LAB("Sent to the Lab"),
    SHIPPED ("Order has been Shipped"),
    DELIVERED("Order Delivered"),
    RECEIVED("Received"),
	SAMPLE_RECEIVED("Sample is Received"),
	RESULTS_READY("Result Ready");
	
	
	
	  private String status;

	    OrderStatus(String status) {
	        this.status = status;
	    }

	    public String getStatus() {
	        return status;
	    }
	    
	    

}
