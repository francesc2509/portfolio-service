package com.francesc2509.portofolioservice.core.service;

import com.francesc2509.portofolioservice.model.LanguageResponse;
import com.francesc2509.portofolioservice.model.ProgrammingLanguageResponse;

import java.util.List;

public interface PortfolioService {
    List<ProgrammingLanguageResponse> getProgrammingLanguages();
    List<LanguageResponse> getLanguages();
}
