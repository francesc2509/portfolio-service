package com.francesc2509.portofolioservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class })
public class PortfolioServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(PortfolioServiceApplication.class, args);
	}
}
