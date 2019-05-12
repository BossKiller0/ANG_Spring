package com.main.dateapp_main;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class HelloWorldController {
	
	@GetMapping(path = "/hello")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/hellobeans")
	public HelloBean helloWorldBeans() {
		return new HelloBean("Hello World");
	}
	
	// /hellobeanspathvar/demo
	@GetMapping(path = "/hellobeanspathvar/{name}")
	public HelloBean helloWorldBeansPathVar(@PathVariable String name) {
		return new HelloBean("Hello World " +name);
	}
	
	

}
