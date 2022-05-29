package com.francesc2509.portofolioservice.core.service;

import com.francesc2509.portofolioservice.model.LanguageMemberResponse;

import java.util.List;

public interface LanguageMemberService {
    List<LanguageMemberResponse> getLanguagesByMemberId(long memberId);
}
