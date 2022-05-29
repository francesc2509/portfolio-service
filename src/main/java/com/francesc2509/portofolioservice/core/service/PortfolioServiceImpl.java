package com.francesc2509.portofolioservice.core.service;

import com.francesc2509.portofolioservice.model.LanguageLevel;
import com.francesc2509.portofolioservice.model.LanguageResponse;
import com.francesc2509.portofolioservice.model.ProgrammingLanguageResponse;

import java.util.List;

public class PortfolioServiceImpl implements PortfolioService {
    @Override
    public List<ProgrammingLanguageResponse> getProgrammingLanguages() {
        return List.of(
                new ProgrammingLanguageResponse("java", "intermediate", (byte) 3),
                new ProgrammingLanguageResponse("javascript", "intermediate", (byte) 2)
        );
    }

    @Override
    public List<LanguageResponse> getLanguages() {
        return List.of(
                new LanguageResponse("english", false,
                    LanguageLevel.B1, LanguageLevel.B2, LanguageLevel.B1),
                new LanguageResponse("spanish", false,
                    LanguageLevel.C2, LanguageLevel.C2, LanguageLevel.C2)
        );
    }
}
