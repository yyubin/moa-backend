package com.loa.moabackend.Member.controller;

import com.loa.moabackend.Member.model.CertificationCheck;
import com.loa.moabackend.Member.model.MemberStatus;
import com.loa.moabackend.Member.model.dto.SignUpDto.SignUpRequestDto;
import com.loa.moabackend.Member.model.dto.SignUpDto.SignUpResponseDto;
import com.loa.moabackend.Member.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class MemberCommandApi {
    private final MemberService memberService;
    @PostMapping("/sign-up")
    @ResponseStatus(HttpStatus.CREATED)
    public SignUpResponseDto signUP(@RequestBody @Valid SignUpRequestDto body) {
        return memberService.signUpMember(body, MemberStatus.ACTIVE, CertificationCheck.PENDING, LocalDateTime.now());
    }
}
