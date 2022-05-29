package com.francesc2509.portofolioservice.model;

import lombok.Value;

@Value
public class ProgrammingLanguageResponse {
    String name;
    String level;
    byte yearsOfExperience;
}
