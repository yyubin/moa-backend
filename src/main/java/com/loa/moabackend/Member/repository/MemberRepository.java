package com.loa.moabackend.Member.repository;

import com.loa.moabackend.Member.model.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MemberRepository extends JpaRepository<MemberEntity, UUID> {
}
