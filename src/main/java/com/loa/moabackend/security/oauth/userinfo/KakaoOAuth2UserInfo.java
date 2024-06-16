package com.loa.moabackend.security.oauth.userinfo;

import java.util.Map;

public class KakaoOAuth2UserInfo extends OAuth2UserInfo {

    public KakaoOAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }

    @Override
    public String getId() {
        return String.valueOf(attributes.get("id"));
        // 이때, getId는 Long으로 반환되어 (String)으로 캐스팅될 수 없으므로, String.valueOf()를 사용하여 캐스팅해주었음.
    }

    @Override
    public String getNickname() {  // 카카오의 경우에는, 유저 정보가 'kakao_account.profile'으로 2번 감싸져있는 구조이다. ('kakao_account' -> 'profile')
        Map<String, Object> account = (Map<String, Object>) attributes.get("kakao_account");
        if (account == null) {
            return null;
        }

        Map<String, Object> profile = (Map<String, Object>) account.get("profile");
        if (profile == null) {
            return null;
        }

        return (String) profile.get("nickname");
    }

    @Override
    public String getImageUrl() {  // 카카오의 경우에는, 유저 정보가 'kakao_account.profile'으로 2번 감싸져있는 구조이다. ('kakao_account' -> 'profile')
        Map<String, Object> account = (Map<String, Object>) attributes.get("kakao_account");
        if (account == null) {
            return null;
        }

        Map<String, Object> profile = (Map<String, Object>) account.get("profile");
        if (profile == null) {
            return null;
        }

        return (String) profile.get("thumbnail_image_url");
    }
}
