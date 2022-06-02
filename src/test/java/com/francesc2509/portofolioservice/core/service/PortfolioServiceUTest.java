package com.francesc2509.portofolioservice.core.service;

import com.francesc2509.portofolioservice.TestUtils;
import com.francesc2509.portofolioservice.model.LanguageMemberResponse;
import com.francesc2509.portofolioservice.model.ProgrammingLanguageMemberResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class PortfolioServiceUTest {

    private final long MEMBER_ID = 54321L;

    @Mock
    private ProgrammingLanguageMemberService programmingLanguageMemberService;
    @Mock
    private LanguageMemberService languageMemberService;

    @InjectMocks
    private PortfolioServiceImpl testObj;

    @Test
    public void getProgrammingLanguages_ok() {
        List<ProgrammingLanguageMemberResponse> expected = TestUtils.createMockList(ProgrammingLanguageMemberResponse.class, 5);
        when(programmingLanguageMemberService.getProgrammingLanguagesByMemberId(MEMBER_ID)).thenReturn(expected);

        assertThat(testObj.getProgrammingLanguages(MEMBER_ID)).isEqualTo(expected);
        verify(programmingLanguageMemberService).getProgrammingLanguagesByMemberId(MEMBER_ID);
    }

    @Test
    public void getLanguages_ok() {
        List<LanguageMemberResponse> expected = TestUtils.createMockList(LanguageMemberResponse.class, 5);
        when(languageMemberService.getLanguagesByMemberId(MEMBER_ID)).thenReturn(expected);

        assertThat(testObj.getLanguages(MEMBER_ID)).isEqualTo(expected);
        verify(languageMemberService).getLanguagesByMemberId(MEMBER_ID);
    }
}
