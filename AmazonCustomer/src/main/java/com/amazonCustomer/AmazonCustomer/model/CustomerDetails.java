package com.amazonCustomer.AmazonCustomer.model;

public class CustomerDetails 
{
	private Customer customer;
	private Orders orders;
	private Payments payment;
	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerDetails(Customer customer, Orders orders, Payments payment) {
		super();
		this.customer = customer;
		this.orders = orders;
		this.payment = payment;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public Payments getPayment() {
		return payment;
	}
	public void setPayment(Payments payment) {
		this.payment = payment;
	}
	
}
