package com.codmind.warehose.domain;

import java.util.List;

public class Warehouse {
	
	
	private long id;
	private String name;
	private List<WarehouseItem> items;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<WarehouseItem> getItems() {
		return items;
	}
	public void setItems(List<WarehouseItem> items) {
		this.items = items;
	}

	
	
}
