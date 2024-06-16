package com.loa.moabackend.security.oauth.userinfo;

import java.util.Map;

public class GithubOAuth2UserInfo extends OAuth2UserInfo {
    // 깃허브의 경우에는, 네이버,카카오와는 달리 유저 정보가 감싸져 있지 않기 때문에,
    // 바로 get으로 유저 정보 Key를 사용해서 꺼내면 된다.

    public GithubOAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }

    @Override
    public String getId() {
        return String.valueOf(attributes.get("id"));
        // 이때, getId는 Long으로 반환되어 (String)으로 캐스팅될 수 없으므로, String.valueOf()를 사용하여 캐스팅해주었음.
    }

    @Override
    public String getNickname() {
        return (String) attributes.get("name");
    }

    @Override
    public String getImageUrl() {
        return (String) attributes.get("avatar_url");
    }
}
