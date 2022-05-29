package com.francesc2509.portofolioservice.config;

import com.francesc2509.portofolioservice.core.db.repository.LanguageMemberRepository;
import com.francesc2509.portofolioservice.core.db.repository.ProgrammingLanguageMemberRepository;
import com.francesc2509.portofolioservice.core.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PortfolioService portfolioService(LanguageMemberService languageMemberService, ProgrammingLanguageMemberService programmingLanguageMemberService) {
        return new PortfolioServiceImpl(programmingLanguageMemberService, languageMemberService);
    }

    @Bean
    public LanguageMemberService languageMemberService(LanguageMemberRepository repository) {
        return new LanguageMemberServiceImpl(repository);
    }

    @Bean
    public ProgrammingLanguageMemberService programmingLanguageMemberService(ProgrammingLanguageMemberRepository repository) {
        return new ProgrammingLanguageMemberServiceImpl(repository);
    }
}
