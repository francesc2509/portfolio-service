package com.francesc2509.portofolioservice.core.db.repository;

import com.francesc2509.portofolioservice.core.db.entity.MemberEntity;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<MemberEntity, Long> {
}
