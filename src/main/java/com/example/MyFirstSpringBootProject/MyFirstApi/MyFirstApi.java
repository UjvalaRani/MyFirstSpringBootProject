package com.example.MyFirstSpringBootProject.MyFirstApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstApi {

	@GetMapping(value="/amith")
	public String greet1()
	{
		return "welcome to SpringBoot";
	}
	
	@GetMapping(value="/amith1")
	public String greet2()
	{
		return "welcome to SprisdzngBoot 2";
	}
}
