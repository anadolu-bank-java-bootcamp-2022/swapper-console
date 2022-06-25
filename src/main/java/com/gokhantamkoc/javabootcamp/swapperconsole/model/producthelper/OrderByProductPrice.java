package com.gokhantamkoc.javabootcamp.swapperconsole.model.producthelper;

import java.util.Comparator;

import com.gokhantamkoc.javabootcamp.swapperconsole.model.Product;

public class OrderByProductPrice implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		// DOGRU YONTEM
		return Double.valueOf(p1.getPrice()).compareTo(Double.valueOf(p2.getPrice()));
		
		// YANLIS YONTEM DOGRU SIRALAMA YAPMAZ
		// return (int)(p1.getPrice() - p2.getPrice());
	}

}
