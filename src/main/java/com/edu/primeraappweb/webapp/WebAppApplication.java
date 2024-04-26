package com.edu.primeraappweb.webapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class WebAppApplication{
	@Autowired

	public static void main(String[] args) {
		SpringApplication.run(WebAppApplication.class, args);
		System.out.println("Hello World app in port: 8080");
	}
}
 