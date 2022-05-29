package com.francesc2509.portofolioservice.api.controller;

import com.francesc2509.portofolioservice.model.LanguageMemberResponse;
import com.francesc2509.portofolioservice.model.ProgrammingLanguageMemberResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/portfolio")
public interface PortfolioController {

    @GetMapping(path = "/programming-languages/member/{memberId}")
    ResponseEntity<List<ProgrammingLanguageMemberResponse>> getProgrammingLanguages(@PathVariable long memberId) throws Exception;
    @GetMapping(path = "/languages/member/{memberId}")
    ResponseEntity<List<LanguageMemberResponse>> getLanguages(@PathVariable long memberId);
}
