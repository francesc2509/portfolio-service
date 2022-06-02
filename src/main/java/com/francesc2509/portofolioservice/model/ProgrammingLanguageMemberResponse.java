package com.francesc2509.portofolioservice.model;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.NonFinal;

@Value
@Builder
@NonFinal
public class ProgrammingLanguageMemberResponse {
    String name;
    long programmingLanguageId;
    String level;
    byte yearsOfExperience;
}
