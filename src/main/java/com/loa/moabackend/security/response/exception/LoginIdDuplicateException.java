package com.loa.moabackend.security.response.exception;

import com.loa.moabackend.security.response.responseitem.MessageItem;
import com.loa.moabackend.security.response.responseitem.StatusItem;
import lombok.Getter;

@Getter
public class LoginIdDuplicateException extends RuntimeException {

    private Integer errorStatus;
    private String errorMessage;

    private String loginId;

    public LoginIdDuplicateException(String loginId) {
        this.errorStatus = StatusItem.BAD_REQUEST;
        this.errorMessage = MessageItem.DUPLICATE_USER;

        this.loginId = loginId;
    }
}