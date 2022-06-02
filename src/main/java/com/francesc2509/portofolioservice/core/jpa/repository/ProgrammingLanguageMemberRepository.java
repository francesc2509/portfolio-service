package com.francesc2509.portofolioservice.core.jpa.repository;

import com.francesc2509.portofolioservice.core.jpa.entity.ProgrammingLanguageMemberEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProgrammingLanguageMemberRepository extends CrudRepository<ProgrammingLanguageMemberEntity, Long> {
    List<ProgrammingLanguageMemberEntity> findByMemberId(long memberId);
}
