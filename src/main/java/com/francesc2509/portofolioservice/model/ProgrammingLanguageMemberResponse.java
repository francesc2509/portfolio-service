package com.francesc2509.portofolioservice.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ProgrammingLanguageMemberResponse {
    String name;
    long programmingLanguageId;
    String level;
    byte yearsOfExperience;
}
