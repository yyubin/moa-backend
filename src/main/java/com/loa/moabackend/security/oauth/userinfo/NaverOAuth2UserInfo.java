package com.loa.moabackend.security.oauth.userinfo;

import java.util.Map;

public class NaverOAuth2UserInfo extends OAuth2UserInfo {

    public NaverOAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }

    @Override
    public String getId() {  // 네이버의 경우에는, 유저 정보가 'reponse'으로 1번 더 감싸져있는 구조이다. 그래서 get으로 갖고온 reponse에서 다시 get으로 id를 갖고와야한다.
        Map<String, Object> response = (Map<String, Object>) attributes.get("response");
        if (response == null) {
            return null;
        }

        return (String) response.get("id");  // get으로 꺼내면 Object로 반환되기 때문에 String으로 캐스팅하여 반환해야함.
    }

    @Override
    public String getNickname() {
        Map<String, Object> response = (Map<String, Object>) attributes.get("response");

        if (response == null) {
            return null;
        }

        return (String) response.get("nickname");
    }

    @Override
    public String getImageUrl() {
        Map<String, Object> response = (Map<String, Object>) attributes.get("response");

        if (response == null) {
            return null;
        }

        return (String) response.get("profile_image");
    }
}