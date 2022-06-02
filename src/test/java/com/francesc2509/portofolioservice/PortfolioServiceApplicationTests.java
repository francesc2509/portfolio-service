package com.francesc2509.portofolioservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PortfolioServiceApplicationTests {

	@Autowired
	private PortfolioServiceApplication application;

	@Test
	void contextLoads() {
		assertThat(application).isNotNull();
	}

}
