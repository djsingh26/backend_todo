package com.dj.rest.webservices.restfulwebservices.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {
	
	//GET
	//URI - /hello world
	//method
	//@RequestMapping(method=RequestMethod.GET, path="/hello-world")
//	@GetMapping(path="/hello-world")
//	public String helloWorld() {
//		return "Hello World";
//		
//	}
	
	@GetMapping(path="/basicauth")
	public AuthenticationBean helloWorldBean() {
		return new AuthenticationBean("Your are authenticated");
//		throw new RuntimeException("some error occured");
	}
	
//	@GetMapping(path="hello-world/path-variable/{name}")
//	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
//		return new HelloWorldBean(String.format("hello world, %s",name));
//	}
	
}
