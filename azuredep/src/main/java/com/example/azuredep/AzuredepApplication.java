package com.example.azuredep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class AzuredepApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzuredepApplication.class, args);
	}
	
	
	@GetMapping
	public String hello() {
		
		return "Hello World";
		
	}

}
