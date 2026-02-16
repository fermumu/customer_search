package com.customer_data_consultant;

import com.customer_data_consultant.domain.model.entity.Customers;
import com.customer_data_consultant.domain.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerDataConsultantApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerDataConsultantApplication.class, args);
	}

	@Bean
	CommandLineRunner init(CustomerRepository repo) {
		return args -> repo.save(
				new Customers(null,"hector", "muñoz", "M-1212", "COL-057","HOLA","CC", 1085247127, "CC-25")
		);
	}

}

