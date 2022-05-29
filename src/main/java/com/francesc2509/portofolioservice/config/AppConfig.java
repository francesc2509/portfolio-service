package com.francesc2509.portofolioservice.config;

import com.francesc2509.portofolioservice.core.service.PortfolioService;
import com.francesc2509.portofolioservice.core.service.PortfolioServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PortfolioService portfolioService() {
        return new PortfolioServiceImpl();
    }
}
