package com.loa.moabackend.Member.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum MemberStatus {
    PENDING,
    ACTIVE,
    BLOCKED,
    PROTECTED,
    SLEEP,
    REMOVED
}
