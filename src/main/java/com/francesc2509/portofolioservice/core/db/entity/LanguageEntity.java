package com.francesc2509.portofolioservice.core.db.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "tLanguage")
@Getter
public class LanguageEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
}
