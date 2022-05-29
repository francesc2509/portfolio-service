package com.francesc2509.portofolioservice.core.service;

import com.francesc2509.portofolioservice.model.LanguageMemberResponse;
import com.francesc2509.portofolioservice.model.ProgrammingLanguageMemberResponse;

import java.util.List;

public interface PortfolioService {
    List<ProgrammingLanguageMemberResponse> getProgrammingLanguages(long memberId);
    List<LanguageMemberResponse> getLanguages(long memberId);
}
