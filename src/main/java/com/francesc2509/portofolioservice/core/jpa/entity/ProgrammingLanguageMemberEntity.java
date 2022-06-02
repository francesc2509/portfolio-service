package com.francesc2509.portofolioservice.core.jpa.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "tProgrammingLanguage_Member")
@Getter
public class ProgrammingLanguageMemberEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "memberId")
    private long memberId;
    @ManyToOne
    @JoinColumn(name = "programmingLanguageId")
    private ProgrammingLanguageEntity programmingLanguage;
    @Column(name = "knowledgeLevel")
    private String knowledgeLevel;
    @Column(name = "yearsOfExperience")
    private byte yearsOfExperience;
}
