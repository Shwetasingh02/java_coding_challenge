package com.model;

public class Electronics extends Product {
	
	private int product_id;
	private String brand;
	private String warranty_period;
	
	
	public Electronics(int id, String name, String describtion, int price, int quantity_in_stock,
			int product_id, String brand, String warranty_period) {
		super(id, name, describtion, price, quantity_in_stock);
		this.product_id = product_id;
		this.brand = brand;
		this.warranty_period = warranty_period;
	}


	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Electronics(int id, String name, String describtion, int price, int quantity_in_stock) {
		super(id, name, describtion, price, quantity_in_stock);
		// TODO Auto-generated constructor stub
	}


	public int getProduct_id() {
		return product_id;
	}


	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getWarranty_period() {
		return warranty_period;
	}


	public void setWarranty_period(String warranty_period) {
		this.warranty_period = warranty_period;
	}


	@Override
	public String toString() {
		return "Electronics [product_id=" + product_id + ", brand=" + brand + ", warranty_period=" + warranty_period
				+ "]";
	}
}