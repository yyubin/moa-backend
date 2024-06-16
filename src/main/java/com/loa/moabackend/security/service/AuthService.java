package com.loa.moabackend.security.service;

import com.loa.moabackend.security.dto.auth.SignupResponseDto;
import com.loa.moabackend.security.dto.user.UserSignupRequestDto;

public interface AuthService {
    SignupResponseDto signup(UserSignupRequestDto userSignupRequestDto);
}
