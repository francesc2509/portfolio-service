package com.francesc2509.portofolioservice.api.controller;


import com.francesc2509.portofolioservice.TestUtils;
import com.francesc2509.portofolioservice.core.service.PortfolioService;
import com.francesc2509.portofolioservice.model.LanguageMemberResponse;
import com.francesc2509.portofolioservice.model.ProgrammingLanguageMemberResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class PortfolioControllerUTest {
    private final long MEMBER_ID = 2341L;

    @Mock
    private PortfolioService portfolioService;

    @InjectMocks
    private PortfolioControllerImpl testObj;

    @Test
    public void getProgrammingLanguages_ok() {
        List<ProgrammingLanguageMemberResponse> programmingLanguages = TestUtils.createMockList(ProgrammingLanguageMemberResponse.class, 3);
        when(portfolioService.getProgrammingLanguages(MEMBER_ID)).thenReturn(programmingLanguages);

        ResponseEntity<List<ProgrammingLanguageMemberResponse>> expected = ResponseEntity.ok(programmingLanguages);
        assertThat(testObj.getProgrammingLanguages(MEMBER_ID)).isEqualTo(expected);
    }

    @Test
    public void getLanguages_ok() {
        List<LanguageMemberResponse> languages = TestUtils.createMockList(LanguageMemberResponse.class, 3);
        when(portfolioService.getLanguages(MEMBER_ID)).thenReturn(languages);

        ResponseEntity<List<LanguageMemberResponse>> expected = ResponseEntity.ok(languages);
        assertThat(testObj.getLanguages(MEMBER_ID)).isEqualTo(expected);
    }
}
