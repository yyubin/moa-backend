package com.loa.moabackend.security.dto.auth;

import com.loa.moabackend.security.dto.user.UserResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SignupResponseDto {

    private UserResponseDto userResponseDto;
    private TokenDto tokenDto;
}