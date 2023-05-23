package com.example.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class MavenApplication {

	@RequestMapping("/")
	@ResponseBody
	String home(){
		return "Hello World!";
	}
	@RequestMapping("about")
	@ResponseBody
	String about(){
		return "Sample Maven Build";
	}
	public static void main(String[] args) {
		SpringApplication.run(MavenApplication.class, args);
		
	}
}
