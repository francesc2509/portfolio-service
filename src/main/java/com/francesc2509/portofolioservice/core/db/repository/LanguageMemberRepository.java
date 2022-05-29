package com.francesc2509.portofolioservice.core.db.repository;

import com.francesc2509.portofolioservice.core.db.entity.LanguageMemberEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LanguageMemberRepository extends CrudRepository<LanguageMemberEntity, Long> {
    List<LanguageMemberEntity> findByMemberId(long memberId);
}
