package com.example.demo;

@RestController
public class HelloController {

	@RequestMaping("/hello")
	public String hello() {
		return "Hello";
	}
}