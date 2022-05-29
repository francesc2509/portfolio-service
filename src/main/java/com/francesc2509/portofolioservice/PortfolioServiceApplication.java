package com.francesc2509.portofolioservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class PortfolioServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(PortfolioServiceApplication.class, args);
	}
}
