package com.loa.moabackend.Member.service;


import com.loa.moabackend.Member.model.CertificationCheck;
import com.loa.moabackend.Member.model.MemberStatus;
import com.loa.moabackend.Member.model.dto.SignUpDto.SignUpRequestDto;
import com.loa.moabackend.Member.model.dto.SignUpDto.SignUpResponseDto;

import java.time.LocalDateTime;

public interface MemberService {
    SignUpResponseDto signUpMember(SignUpRequestDto dto, MemberStatus status, CertificationCheck check, LocalDateTime createdAt);

}
