package com.gokhantamkoc.javabootcamp.swapperconsole.service;

import java.util.Iterator;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gokhantamkoc.javabootcamp.swapperconsole.model.Product;
import com.gokhantamkoc.javabootcamp.swapperconsole.model.producthelper.OrderByProductName;
import com.gokhantamkoc.javabootcamp.swapperconsole.model.producthelper.OrderByProductPrice;
import com.gokhantamkoc.javabootcamp.swapperconsole.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public ProductService() {
	}
	
	public void runService() {

		Scanner keyboardInput = new Scanner(System.in);
		// List, Map, Set, Queue ve Deque olmasaydi
		
		while(true) {
			System.out.println("Sıralama neye yapmak göre yapmak istiyorsun? Ada göre (A), Fiyat'a göre (B)");
			String input = getAnswerInput(keyboardInput);
			if (input.equalsIgnoreCase("A")) {
				productRepository.getProducts().sort(new OrderByProductName());
			} else if (input.equalsIgnoreCase("B")) {
				productRepository.getProducts().sort(new OrderByProductPrice());
			}
			this.iterateProducts(productRepository);
		}
	}
	
	public String getAnswerInput(Scanner keyboardInput) {
		return keyboardInput.nextLine();
	}
	
	public void iterateProducts(ProductRepository productRepository) {
		Iterator<Product> iterateProductHandler = productRepository.getProducts().iterator();
		while (iterateProductHandler.hasNext()) {
			Product product = iterateProductHandler.next();
			System.out.println(product.getName());
		}
	}
}
