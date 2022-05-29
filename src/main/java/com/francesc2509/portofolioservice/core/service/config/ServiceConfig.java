package com.francesc2509.portofolioservice.core.service.config;

import com.francesc2509.portofolioservice.core.db.repository.LanguageMemberRepository;
import com.francesc2509.portofolioservice.core.db.repository.ProgrammingLanguageMemberRepository;
import com.francesc2509.portofolioservice.core.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ServiceConfig {

    private final LanguageMemberRepository languageMemberRepository;
    private final  ProgrammingLanguageMemberRepository programmingLanguageMemberRepository;

    @Bean
    public PortfolioService portfolioService() {
        return new PortfolioServiceImpl(programmingLanguageMemberService(), languageMemberService());
    }

    @Bean
    public ProgrammingLanguageMemberService programmingLanguageMemberService() {
        return new ProgrammingLanguageMemberServiceImpl(programmingLanguageMemberRepository);
    }

    @Bean
    public LanguageMemberService languageMemberService() {
        return new LanguageMemberServiceImpl(languageMemberRepository);
    }
}
