package com.francesc2509.portofolioservice.core.jpa.entity;

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
