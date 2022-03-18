package com.atmobileshop.atmobileshoppsql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class AtmobileshopPsqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtmobileshopPsqlApplication.class, args);
	}

}
