package com.francesc2509.portofolioservice.api.controller;

import com.francesc2509.portofolioservice.model.LanguageResponse;
import com.francesc2509.portofolioservice.model.ProgrammingLanguageResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/portfolio")
public interface PortfolioController {

    @GetMapping(path = "/programming-languages/{id}")
    ResponseEntity<List<ProgrammingLanguageResponse>> getProgrammingLanguages(@PathVariable int id) throws Exception;
    @GetMapping(path = "/languages")
    ResponseEntity<List<LanguageResponse>> getLanguages();
}
