package com.loa.moabackend.Member.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Member {
    public UUID id;
    /** 계정 **/
    private String username;
    private String password;

    private String nickname;

    /** 계정 상태 **/
    private MemberStatus status;

    private CertificationCheck certificationCheck;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
