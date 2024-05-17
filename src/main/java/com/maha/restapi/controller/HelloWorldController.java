package com.maha.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@@Controller
//@ResponseBody
@RestController
public class HelloWorldController {
	
	//GET METHOD
	//http://localhost:8080/restapi/hello-world
	
	@GetMapping("/restapi/hello-world")
	public String helloWorld() {
		return "Hello World, welcome to 1st rest API";
	}
}
