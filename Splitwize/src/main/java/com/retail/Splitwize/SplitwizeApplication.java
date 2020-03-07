package com.retail.Splitwize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.retail.Splitwize"})
public class SplitwizeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SplitwizeApplication.class, args);
	}

}
