package com.esprit.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}
	
	@Autowired
	private ProductRepository productRepositoryInstance;
	
	/*@Bean
	ApplicationRunner init() {
		return (args) -> {
			// save
			productRepositoryInstance.save(new Product("TV", 2, "TV"));
			productRepositoryInstance.save(new Product("Climatiseur", 5, "Climatiseurs"));
			productRepositoryInstance.save(new Product("Machine a laver", 7, "lave-linge"));
			// fetch
			productRepositoryInstance.findAll().forEach(System.out::println);
		};
	}*/

}
