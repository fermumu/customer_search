package com.customer_data_consultant;

import com.customer_data_consultant.domain.model.entity.Customers;
import com.customer_data_consultant.domain.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerDataConsultantApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerDataConsultantApplication.class, args);
	}

	@Bean
	CommandLineRunner init(CustomerRepository repo) {
		return args -> repo.saveAll(List.of(

				new Customers(null,"Hector","Muñoz","M-1","COL-057","M","CC",1085247127,"CC-25"),
				new Customers(null,"Laura","Gomez","M-2","COL-057","F","CC",1023456789,"CC-25"),
				new Customers(null,"Carlos","Ramirez","M-3","COL-057","M","CC",1012345678,"CC-25"),
				new Customers(null,"Andrea","Lopez","M-4","COL-057","F","CC",1098765432,"CC-25"),
				new Customers(null,"Juan","Perez","M-5","COL-057","M","CC",1009876543,"CC-25"),
				new Customers(null,"Maria","Castro","M-6","COL-057","F","CC",1034567890,"CC-25"),
				new Customers(null,"Santiago","Rojas","M-7","COL-057","M","CC",1045678901,"CC-25"),
				new Customers(null,"Diana","Morales","M-8","COL-057","F","CC",1056789012,"CC-25"),
				new Customers(null,"Felipe","Torres","M-9","COL-057","M","CC",1067890123,"CC-25"),
				new Customers(null,"Paula","Vargas","M-10","COL-057","F","CC",1078901234,"CC-25")

		));
	}

}

