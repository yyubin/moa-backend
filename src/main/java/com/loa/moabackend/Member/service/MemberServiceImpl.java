package com.loa.moabackend.Member.service;

import com.loa.moabackend.Member.mapper.MemberDtoMapper;
import com.loa.moabackend.Member.model.CertificationCheck;
import com.loa.moabackend.Member.model.MemberStatus;
import com.loa.moabackend.Member.model.dto.SignUpDto.SignUpRequestDto;
import com.loa.moabackend.Member.model.dto.SignUpDto.SignUpResponseDto;
import com.loa.moabackend.Member.model.entity.MemberEntity;
import com.loa.moabackend.Member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;
    private final MemberDtoMapper mapper;

    //TODO 비밀번호 암호화, 시큐리티 해제 풀기, 아이디, 닉네임 중복 처리
    @Override
    public SignUpResponseDto signUpMember(SignUpRequestDto dto, MemberStatus status, CertificationCheck check, LocalDateTime createdAt) {
        MemberEntity memberEntity = mapper.from(dto, status, check, createdAt);
        memberRepository.save(memberEntity);
        return SignUpResponseDto.builder()
                .success(true)
                .build();

    }
}
