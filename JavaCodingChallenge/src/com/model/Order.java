package com.model;

public class Order {

	
	private int id;
	private int user_id;
	private int product_id;
	
	public Order(int id, int user_id, int product_id) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.product_id = product_id;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", user_id=" + user_id + ", product_id=" + product_id + "]";
	}
	
	
}
