package com.example.restintro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	@GetMapping("/home")
	public String home() {
		System.out.println("Hello ");
		return "Welcome to Rest Application";

}
}