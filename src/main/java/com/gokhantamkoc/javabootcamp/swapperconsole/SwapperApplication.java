package com.gokhantamkoc.javabootcamp.swapperconsole;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gokhantamkoc.javabootcamp.swapperconsole.service.ProductService;


@SpringBootApplication
public class SwapperApplication implements CommandLineRunner {
	
	public static void main(String... args) {
		SpringApplication.run(SwapperApplication.class, args);
	}
	
	@Autowired
	ProductService productService;

	@Override
	public void run(String... args) throws Exception {
		productService.runService();
	}

}
