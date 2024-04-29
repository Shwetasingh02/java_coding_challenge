package com.model;

public class Clothing extends Product{
	
	private int product_id;
	private String size;
	private String color;
	
	
	public Clothing(int id, String name, String describtion, int price, int quantity_in_stock, int type, int product_id,
			String size, String color) {
		super(id, name, describtion, price, quantity_in_stock);
		this.product_id = product_id;
		this.size = size;
		this.color = color;
	}


	public Clothing() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Clothing(int id, String name, String describtion, int price, int quantity_in_stock, int type) {
		super(id, name, describtion, price, quantity_in_stock);
		// TODO Auto-generated constructor stub
	}


	public int getProduct_id() {
		return product_id;
	}


	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Clothing [product_id=" + product_id + ", size=" + size + ", color=" + color + "]";
	}
}