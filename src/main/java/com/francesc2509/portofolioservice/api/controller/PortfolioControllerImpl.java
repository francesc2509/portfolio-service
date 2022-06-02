package com.francesc2509.portofolioservice.api.controller;

import com.francesc2509.portofolioservice.core.service.PortfolioService;
import com.francesc2509.portofolioservice.model.LanguageMemberResponse;
import com.francesc2509.portofolioservice.model.ProgrammingLanguageMemberResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PortfolioControllerImpl implements PortfolioController {
    private final PortfolioService portfolioService;

    @Override
    public ResponseEntity<List<ProgrammingLanguageMemberResponse>> getProgrammingLanguages(long memberId) {
        return ResponseEntity.ok(portfolioService.getProgrammingLanguages(memberId));
    }

    @Override
    public ResponseEntity<List<LanguageMemberResponse>> getLanguages(long memberId) {
        return ResponseEntity.ok(portfolioService.getLanguages(memberId));
    }
}
