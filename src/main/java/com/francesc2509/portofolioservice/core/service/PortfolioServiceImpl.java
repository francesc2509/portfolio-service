package com.francesc2509.portofolioservice.core.service;

import com.francesc2509.portofolioservice.model.LanguageMemberResponse;
import com.francesc2509.portofolioservice.model.ProgrammingLanguageMemberResponse;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PortfolioServiceImpl implements PortfolioService {
    private final ProgrammingLanguageMemberService programmingLanguageMemberService;
    private final LanguageMemberService languageMemberService;

    @Override
    public List<ProgrammingLanguageMemberResponse> getProgrammingLanguages(long memberId) {
        return programmingLanguageMemberService.getProgrammingLanguagesByMemberId(memberId);
    }

    @Override
    public List<LanguageMemberResponse> getLanguages(long memberId) {
        return languageMemberService.getLanguagesByMemberId(memberId);
    }
}
