package com.loa.moabackend.Member.mapper;

import com.loa.moabackend.Member.model.CertificationCheck;
import com.loa.moabackend.Member.model.MemberStatus;
import com.loa.moabackend.Member.model.dto.SignUpDto.SignUpRequestDto;
import com.loa.moabackend.Member.model.entity.MemberEntity;
import org.mapstruct.Mapper;

import java.time.LocalDateTime;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface MemberDtoMapper {
    MemberEntity from(SignUpRequestDto dto, MemberStatus status, CertificationCheck certificationCheck, LocalDateTime createdAt);
}
