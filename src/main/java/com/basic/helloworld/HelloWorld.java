package com.basic.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class HelloWorld {
	
	@GetMapping("/")
	public String greeting() {
		return "HelloWorld Bhargav Reddy!!";
	}

}
