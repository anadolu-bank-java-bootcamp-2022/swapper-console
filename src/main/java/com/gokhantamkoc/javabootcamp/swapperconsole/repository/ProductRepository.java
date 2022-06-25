package com.gokhantamkoc.javabootcamp.swapperconsole.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gokhantamkoc.javabootcamp.swapperconsole.model.Product;

@Repository
public class ProductRepository {
	private List<Product> products;

	public ProductRepository() {
		this.products = new ArrayList<Product>();
		this.products.add(new Product(1, "Sataş Süt", "Meşrubat", 20.0d));
		this.products.add(new Product(2, "Kappi Elma", "Meşrubat", 7.8d));
		this.products.add(new Product(3, "Peyna Beyaz Peynir", "Yiyecek", 7.5d));
	}
	
	public void addOwner(Product product) {
		this.products.add(product);
	}
	
	public void removeOwner(int ownerId) {
		Iterator<Product> iterateProductHandler = this.getProducts().iterator();
		while (iterateProductHandler.hasNext()) {
			Product product = iterateProductHandler.next();
			if (product.getId() == ownerId) {
				iterateProductHandler.remove();
				return;
			}
		}
	}

	public List<Product> getProducts() {
		return products;
	}
}
