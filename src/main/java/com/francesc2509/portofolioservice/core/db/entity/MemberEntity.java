package com.francesc2509.portofolioservice.core.db.entity;

import lombok.RequiredArgsConstructor;
import lombok.Value;

import javax.persistence.*;

@Entity
@Table(name = "tMember")
public class MemberEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
}
