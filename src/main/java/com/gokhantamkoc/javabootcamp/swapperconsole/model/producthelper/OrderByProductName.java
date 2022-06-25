package com.gokhantamkoc.javabootcamp.swapperconsole.model.producthelper;

import java.util.Comparator;

import com.gokhantamkoc.javabootcamp.swapperconsole.model.Product;

public class OrderByProductName implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
