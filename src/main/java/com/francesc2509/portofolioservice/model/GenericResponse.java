package com.francesc2509.portofolioservice.model;

import lombok.Value;

@Value
public class GenericResponse {
    boolean ok;
    Object data;
}
