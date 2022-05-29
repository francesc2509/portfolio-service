package com.francesc2509.portofolioservice.core.db.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "tLanguage_Member")
@Getter
public class LanguageMemberEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "memberId")
    private long memberId;
    @ManyToOne
    @JoinColumn(name = "languageId")
    private LanguageEntity language;
    @Column(name = "knowledgeLevel")
    private String knowledgeLevel;
}
