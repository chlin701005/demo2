package com.uuu.demo.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Demo2Application {
	@RequestMapping("/")
	public String home() {
		return "hello spring boot from maven";
	}
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}
