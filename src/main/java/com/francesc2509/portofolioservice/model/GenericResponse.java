package com.francesc2509.portofolioservice.model;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode
public class GenericResponse {
    boolean ok;
    Object data;
}
