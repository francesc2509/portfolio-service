package com.francesc2509.portofolioservice.model;

import lombok.Value;

@Value
public class LanguageResponse {
    String name;
    boolean nativeSpeaker;
    LanguageLevel readingLevel;
    LanguageLevel writingLevel;
    LanguageLevel speakingLevel;
}
