package com.francesc2509.portofolioservice.core.jpa.repository;

import com.francesc2509.portofolioservice.core.jpa.entity.MemberEntity;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<MemberEntity, Long> {
}
