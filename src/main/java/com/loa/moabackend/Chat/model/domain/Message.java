package com.loa.moabackend.chat.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Message {
    private UUID id;

    private ChatRoom chatRoom;

    private String content;

    private UUID sender;

    private LocalDateTime sendTime;
}