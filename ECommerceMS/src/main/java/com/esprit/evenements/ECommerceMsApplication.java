package com.esprit.evenements;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ECommerceMsApplication {
	


	
	//SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	//Date d =dateFormat.parse("30/09/2020");
	//Date d1 =dateFormat.parse("30/09/2021");

	public static void main(String[] args) {
		SpringApplication.run(ECommerceMsApplication.class, args);
	}
	
	@Autowired
	private EvenementRepository repository;
	
	@Bean
	ApplicationRunner init() {
		
		return(args) -> {
			
			
			//save
		repository.save(new Evenement("test","test2","30/09/2020","30/09/2021","image.png"));
			//fetch
		repository.findAll().forEach(System.out::println);
	};
	}

}
