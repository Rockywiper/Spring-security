package com.amazonCustomer.AmazonCustomer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long cId;
	private String cname;
	private String caddress;
	private String cmobile;
	private Long oId;
	private Long pId;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Long cId, String cname, String caddress, String cmobile, Long oId, Long pId) {
		super();
		this.cId = cId;
		this.cname = cname;
		this.caddress = caddress;
		this.cmobile = cmobile;
		this.oId = oId;
		this.pId = pId;
	}
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getCmobile() {
		return cmobile;
	}
	public void setCmobile(String cmobile) {
		this.cmobile = cmobile;
	}
	public Long getoId() {
		return oId;
	}
	public void setoId(Long oId) {
		this.oId = oId;
	}
	public Long getpId() {
		return pId;
	}
	public void setpId(Long pId) {
		this.pId = pId;
	}
	
}
