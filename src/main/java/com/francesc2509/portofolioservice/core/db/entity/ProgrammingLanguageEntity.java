package com.francesc2509.portofolioservice.core.db.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "tProgrammingLanguage")
@Getter
public class ProgrammingLanguageEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
}
