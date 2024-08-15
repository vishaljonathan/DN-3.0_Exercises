package com.employeemanagementsystem.employeemanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // Enable JPA Auditing
public class EmployeemanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagementsystemApplication.class, args);
	}

}
