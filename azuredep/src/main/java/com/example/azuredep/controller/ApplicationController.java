package com.example.azuredep.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {

	
	@GetMapping("/hello")
	@ResponseBody
	public String getHelloMessage() {
		return "Hello World";
	}
	
	
	
	@GetMapping("/users")
	@ResponseBody
	public List<String> getUsers() {
		
		List<String> users = Arrays.asList("Montu", "Sonu","Rahul","Deepak");
		return users ;
	}

}
