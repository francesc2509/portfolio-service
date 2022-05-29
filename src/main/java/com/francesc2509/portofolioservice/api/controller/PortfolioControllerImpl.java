package com.francesc2509.portofolioservice.api.controller;

import com.francesc2509.portofolioservice.core.service.PortfolioService;
import com.francesc2509.portofolioservice.model.LanguageResponse;
import com.francesc2509.portofolioservice.model.ProgrammingLanguageResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PortfolioControllerImpl implements PortfolioController {
    private final PortfolioService portfolioService;

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("Pong!");
    }

    @Override
    public ResponseEntity<List<ProgrammingLanguageResponse>> getProgrammingLanguages(int id) throws Exception {
        return ResponseEntity.ok(portfolioService.getProgrammingLanguages());
    }

    @Override
    public ResponseEntity<List<LanguageResponse>> getLanguages() {
        return ResponseEntity.ok(portfolioService.getLanguages());
    }
}
