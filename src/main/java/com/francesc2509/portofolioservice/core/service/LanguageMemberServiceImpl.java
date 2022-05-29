package com.francesc2509.portofolioservice.core.service;

import com.francesc2509.portofolioservice.core.db.entity.LanguageEntity;
import com.francesc2509.portofolioservice.core.db.repository.LanguageMemberRepository;
import com.francesc2509.portofolioservice.model.LanguageLevel;
import com.francesc2509.portofolioservice.model.LanguageMemberResponse;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class LanguageMemberServiceImpl implements LanguageMemberService {
    private final LanguageMemberRepository repository;

    @Override
    public List<LanguageMemberResponse> getLanguagesByMemberId(long memberId) {
        return repository.findByMemberId(memberId).stream().map(row -> {
            LanguageEntity programmingLanguage = row.getLanguage();

            return LanguageMemberResponse.builder()
                    .knowledgeLevel(LanguageLevel.valueOf(row.getKnowledgeLevel()))
                    .name(programmingLanguage.getName())
                    .languageId(programmingLanguage.getId())
                    .build();
        }).collect(Collectors.toList());
    }
}
