package com.amazonCustomer.AmazonCustomer.model;

public class Orders 
{
	private String productname;
	private Long productprice;
	private String productweight;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(String productname, Long productprice, String productweight) {
		super();
		this.productname = productname;
		this.productprice = productprice;
		this.productweight = productweight;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Long getProductprice() {
		return productprice;
	}
	public void setProductprice(Long productprice) {
		this.productprice = productprice;
	}
	public String getProductweight() {
		return productweight;
	}
	public void setProductweight(String productweight) {
		this.productweight = productweight;
	}
	
}
