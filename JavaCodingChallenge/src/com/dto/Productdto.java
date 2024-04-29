package com.dto;

public class Productdto {
	
	private int id;
	private String name;
	private String describtion;
	private int price;
	private int  quantity_in_stock;
	private String type;
	
	
	
	public Productdto(int id, String name, String describtion, int price, int quantity_in_stock, String type) {
		super();
		this.id = id;
		this.name = name;
		this.describtion = describtion;
		this.price = price;
		this.quantity_in_stock = quantity_in_stock;
		this.type = type;
	}
	public Productdto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescribtion() {
		return describtion;
	}
	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity_in_stock() {
		return quantity_in_stock;
	}
	public void setQuantity_in_stock(int quantity_in_stock) {
		this.quantity_in_stock = quantity_in_stock;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Productdto [id=" + id + ", name=" + name + ", describtion=" + describtion + ", price=" + price
				+ ", quantity_in_stock=" + quantity_in_stock + ", type=" + type + "]";
	}
	
	
	
	

}
