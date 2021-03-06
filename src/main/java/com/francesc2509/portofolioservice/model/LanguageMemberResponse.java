package com.francesc2509.portofolioservice.model;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.NonFinal;

@Value
@Builder
@NonFinal
public class LanguageMemberResponse {
    long languageId;
    String name;
    /*boolean nativeSpeaker;
    LanguageLevel readingLevel;
    LanguageLevel writingLevel;
    LanguageLevel speakingLevel;*/
    LanguageLevel knowledgeLevel;
}
