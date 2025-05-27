package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
    //Simple Method
	// URI - /helloworld1
	//GET - either @request or @get mapping
	
	//@RequestMapping(method = RequestMethod.GET, path="/helloworld")
	@GetMapping("/helloworld1")
	public String helloWorld() {
			return "Hello World!";
	}
	
	@GetMapping("/helloworld-bean")
	public UserDetails helloworldbean() {
		return new UserDetails("danish", "Faridi", "Chennai");
	}
}
