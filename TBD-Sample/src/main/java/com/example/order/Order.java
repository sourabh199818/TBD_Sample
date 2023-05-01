package com.example.order;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.example.Customer.Customer;
import com.example.product.Product;


//import org.springframework.data.annotation.Id;

@Entity
public class Order {
	
	
	
    @Column
    @Id
	private Long Id;
	@Column
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  String productCode ;
	@Column
	private  int  quantity ;
	@Column
	private  String product ;
	@Column
	private  String firstName ;
	@Column
	private  String lastName ;
	@Column
	private  String deliveryAddress1;
	@Column
	private  String deliveryAddress2 ;
	@Column
	private  String deliveryCity ;
	@Column
	private  String deliveryPostcode;
	@Column
	private  String deliveryCounty ;
	@Column
	private  String deliveryState;
	@Column
	private  String deliveryCountryCode ;
	@Column
	private  String email ;
	@Column
	private  String mobileCountryCode ;
	@Column
	private  String mobileNumber ;
	@Column
	private  String notes ;
	@Column
	private  String physicianDetails ;
	
	 @ManyToOne
	 private Customer customer;
	 
	@ManyToMany
	private List<Product> products;
    private LocalDateTime orderDateTime;
    private OrderStatus orderStatus;
		  
	 public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public LocalDateTime getOrderDateTime() {
		return orderDateTime;
	}
	public void setOrderDateTime(LocalDateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	  
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDeliveryAddress1() {
		return deliveryAddress1;
	}
	public void setDeliveryAddress1(String deliveryAddress1) {
		this.deliveryAddress1 = deliveryAddress1;
	}
	public String getDeliveryAddress2() {
		return deliveryAddress2;
	}
	public void setDeliveryAddress2(String deliveryAddress2) {
		this.deliveryAddress2 = deliveryAddress2;
	}
	public String getDeliveryCity() {
		return deliveryCity;
	}
	public void setDeliveryCity(String deliveryCity) {
		this.deliveryCity = deliveryCity;
	}
	public String getDeliveryPostcode() {
		return deliveryPostcode;
	}
	public void setDeliveryPostcode(String deliveryPostcode) {
		this.deliveryPostcode = deliveryPostcode;
	}
	public String getDeliveryCounty() {
		return deliveryCounty;
	}
	public void setDeliveryCounty(String deliveryCounty) {
		this.deliveryCounty = deliveryCounty;
	}
	public String getDeliveryState() {
		return deliveryState;
	}
	public void setDeliveryState(String deliveryState) {
		this.deliveryState = deliveryState;
	}
	public String getDeliveryCountryCode() {
		return deliveryCountryCode;
	}
	public void setDeliveryCountryCode(String deliveryCountryCode) {
		this.deliveryCountryCode = deliveryCountryCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileCountryCode() {
		return mobileCountryCode;
	}
	public void setMobileCountryCode(String mobileCountryCode) {
		this.mobileCountryCode = mobileCountryCode;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getPhysicianDetails() {
		return physicianDetails;
	}
	public void setPhysicianDetails(String physicianDetails) {
		this.physicianDetails = physicianDetails;
	}
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Order() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order_M [productCode=" + productCode + ", quantity=" + quantity + ", product=" + product
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", deliveryAddress1=" + deliveryAddress1
				+ ", deliveryAddress2=" + deliveryAddress2 + ", deliveryCity=" + deliveryCity + ", deliveryPostcode="
				+ deliveryPostcode + ", deliveryCounty=" + deliveryCounty + ", deliveryState=" + deliveryState
				+ ", deliveryCountryCode=" + deliveryCountryCode + ", email=" + email + ", mobileCountryCode="
				+ mobileCountryCode + ", mobileNumber=" + mobileNumber + ", notes=" + notes + ", physicianDetails="
				+ physicianDetails + "]";
	}
	
	
	
	
	
	
	
	
	

}
