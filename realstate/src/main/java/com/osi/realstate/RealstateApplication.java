package com.osi.realstate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RealstateApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealstateApplication.class, args);
	}
	 @GetMapping("/test")
	public String index() {
		return "This is the CD workflow";
	}
	 @GetMapping("/hello")
	public String hello() {
		return "Hello Guys! Hopefully you did learned the CD automation";
	}

}
