package com.loa.moabackend.security.dto.user;

import com.loa.moabackend.security.domain.user.SocialType;
import com.loa.moabackend.security.domain.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class UserResponseDto {
    // 사용자 정보를 가져오는 ResponseDto

    private Long id;
    private String email;

    private String nickname;
    private String imageUrl;
    private SocialType socialType;

    private LocalDateTime createdTime;

    private String moreInfo1;
    private String moreInfo2;
    private String moreInfo3;

    // DB에서 repository를 통해 조회하거나 가져온 entity(도메인)를 dto로 변환 용도
    public UserResponseDto(User entity) {
        this.id = entity.getId();
        this.email = entity.getEmail();
        this.nickname = entity.getNickname();
        this.imageUrl = entity.getImageUrl();
        this.socialType = entity.getSocialType();
        this.createdTime = entity.getCreatedTime();
        this.moreInfo1 = entity.getMoreInfo1();
        this.moreInfo2 = entity.getMoreInfo2();
        this.moreInfo3 = entity.getMoreInfo3();
    }

}