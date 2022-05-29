package com.francesc2509.portofolioservice.core.db.repository;

import com.francesc2509.portofolioservice.core.db.entity.ProgrammingLanguageMemberEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProgrammingLanguageMemberRepository extends CrudRepository<ProgrammingLanguageMemberEntity, Long> {
    List<ProgrammingLanguageMemberEntity> findByMemberId(long memberId);
}
