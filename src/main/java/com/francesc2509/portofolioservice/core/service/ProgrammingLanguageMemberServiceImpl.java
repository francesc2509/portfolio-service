package com.francesc2509.portofolioservice.core.service;

import com.francesc2509.portofolioservice.core.jpa.entity.ProgrammingLanguageEntity;
import com.francesc2509.portofolioservice.core.jpa.repository.ProgrammingLanguageMemberRepository;
import com.francesc2509.portofolioservice.model.ProgrammingLanguageMemberResponse;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class ProgrammingLanguageMemberServiceImpl implements ProgrammingLanguageMemberService {
    private final ProgrammingLanguageMemberRepository repository;

    @Override
    public List<ProgrammingLanguageMemberResponse> getProgrammingLanguagesByMemberId(long memberId) {
        return repository.findByMemberId(memberId).stream().map(row -> {
            ProgrammingLanguageEntity programmingLanguage = row.getProgrammingLanguage();

            return ProgrammingLanguageMemberResponse.builder()
                    .level(row.getKnowledgeLevel())
                    .name(programmingLanguage.getName())
                    .programmingLanguageId(programmingLanguage.getId())
                    .yearsOfExperience(row.getYearsOfExperience())
                    .build();
        }).collect(Collectors.toList());
    }
}
