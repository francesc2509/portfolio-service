package com.francesc2509.portofolioservice.core.service;

import com.francesc2509.portofolioservice.model.ProgrammingLanguageMemberResponse;

import java.util.List;

public interface ProgrammingLanguageMemberService {
    List<ProgrammingLanguageMemberResponse> getProgrammingLanguagesByMemberId(long memberId);
}
