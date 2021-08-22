package com.gcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@ComponentScan({ "com.gcu" })
@SpringBootApplication
@EnableEncryptableProperties
public class Topic63Application {

	public static void main(String[] args) {
		SpringApplication.run(Topic63Application.class, args);
		System.out.println("hello world");
		
	}

}
