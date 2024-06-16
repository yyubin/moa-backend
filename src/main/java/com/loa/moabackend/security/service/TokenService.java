package com.loa.moabackend.security.service;

import com.loa.moabackend.security.dto.auth.ReissueRequestDto;
import com.loa.moabackend.security.dto.auth.TokenDto;

public interface TokenService {

    TokenDto reissue(ReissueRequestDto reissueRequestDto);
    void updateRefreshToken(Long userId, String refreshToken);
}