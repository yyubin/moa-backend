package com.loa.moabackend.Member.model.policy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Accounts {
    public static class Validation {
        public static final String USERNAME = "^[a-z]+[a-z0-9]{3,30}$";
        public static final String PASSWORD = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,100}$";
    }

    public static class InvalidationMessage {
        public static final String USERNAME_MESSAGE = "아이디는 알파벳 소문자와 숫자를 사용하며, 숫자로 시작할 수 없습니다. (3~30자리)";
        public static final String PASSWORD_MESSAGE = "비밀번호는 영문, 숫자, 특수문자를 모두 사용하여 8자리 이상 100자리 이하입니다.";
    }

}
