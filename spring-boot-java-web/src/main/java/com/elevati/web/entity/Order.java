package com.elevati.web.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	private Long id;
	
	@Column
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date created_at;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date updated_at;
	
	@Column
	private int number;
	
	@Column
	private int total_price;
	
	@Column
	private boolean confirmed;
	
	@Column
	private int total_discounts;
	
	@Column
	private String name;
	
	@Column
	private int total_price_usd;
	
	@Column
	private String user_id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date processed_at;
	
	@Column
	private String app_id;
	
	@Column
	private int order_number;
	
	@Column
	private String contact_email;
	
	@Column
	private String order_status_url;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

	public int getTotal_discounts() {
		return total_discounts;
	}

	public void setTotal_discounts(int total_discounts) {
		this.total_discounts = total_discounts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal_price_usd() {
		return total_price_usd;
	}

	public void setTotal_price_usd(int total_price_usd) {
		this.total_price_usd = total_price_usd;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Date getProcessed_at() {
		return processed_at;
	}

	public void setProcessed_at(Date processed_at) {
		this.processed_at = processed_at;
	}

	public String getApp_id() {
		return app_id;
	}

	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}

	public int getOrder_number() {
		return order_number;
	}

	public void setOrder_number(int order_number) {
		this.order_number = order_number;
	}

	public String getContact_email() {
		return contact_email;
	}

	public void setContact_email(String contact_email) {
		this.contact_email = contact_email;
	}

	public String getOrder_status_url() {
		return order_status_url;
	}

	public void setOrder_status_url(String order_status_url) {
		this.order_status_url = order_status_url;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", email=" + email + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", number=" + number + ", total_price=" + total_price + ", confirmed=" + confirmed
				+ ", total_discounts=" + total_discounts + ", name=" + name + ", total_price_usd=" + total_price_usd
				+ ", user_id=" + user_id + ", processed_at=" + processed_at + ", app_id=" + app_id + ", order_number="
				+ order_number + ", contact_email=" + contact_email + ", order_status_url=" + order_status_url + "]";
	}

}
