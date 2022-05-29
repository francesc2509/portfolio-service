package com.francesc2509.portofolioservice.model;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum LanguageLevel {
    A1("A1"),
    A2("A2"),
    B1("A1"),
    B2("B2"),
    C1("A1"),
    C2("C2");

    private final String level;

    @JsonValue
    public String getLevel() {
        return this.level;
    }
}
