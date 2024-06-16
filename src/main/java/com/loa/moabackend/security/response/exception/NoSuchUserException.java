package com.loa.moabackend.security.response.exception;

import com.loa.moabackend.security.response.responseitem.MessageItem;
import com.loa.moabackend.security.response.responseitem.StatusItem;
import lombok.Getter;

@Getter
public class NoSuchUserException extends RuntimeException  {

    private Integer errorStatus;
    private String errorMessage;

    private String message;

    public NoSuchUserException(String message) {
        this.errorStatus = StatusItem.NOT_FOUND;
        this.errorMessage = MessageItem.NOT_FOUND_USER;

        this.message = message;
    }
}
