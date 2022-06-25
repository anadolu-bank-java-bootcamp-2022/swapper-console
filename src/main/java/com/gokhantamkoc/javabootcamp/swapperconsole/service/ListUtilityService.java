package com.gokhantamkoc.javabootcamp.swapperconsole.service;

import java.util.ArrayList;
import java.util.List;

public class ListUtilityService<T> {
	
	private List<T> itemList;
	
	public ListUtilityService() {
		this.itemList = new ArrayList<T>();
	}
	
	public void addItem(T item) {
		this.itemList.add(item);
	}
	
	public T getItem(Integer index) {
		return this.itemList.get(index);
	}
}
