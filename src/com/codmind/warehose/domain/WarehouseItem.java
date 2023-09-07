package com.codmind.warehose.domain;

public class WarehouseItem {
	
	private Product product;
	private double quantity;
	private double minQuantity;
	
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getMinQuantity() {
		return minQuantity;
	}
	public void setMinQuantity(double minQuantity) {
		this.minQuantity = minQuantity;
	}
	

}
