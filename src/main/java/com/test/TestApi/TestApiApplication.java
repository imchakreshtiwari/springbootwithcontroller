package com.test.TestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApiApplication.class, args);
		System.out.println("hello world");
	}
	@RequestMapping(value="/hellogetfrommain" , method=RequestMethod.GET)
	public String sayHello()
	{
		return "hello";
	}
}
