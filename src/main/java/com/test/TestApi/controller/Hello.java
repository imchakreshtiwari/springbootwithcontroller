package com.test.TestApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Hello {

	@GetMapping("/hello")
	public void sayHelo()
	{
		System.out.println("hello from controller");
	}
	
}
