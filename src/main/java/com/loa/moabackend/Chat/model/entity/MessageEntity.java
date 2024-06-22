package com.loa.moabackend.chat.model.entity;

import com.loa.moabackend.Member.model.entity.MemberEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "message", schema = "chat")
public class MessageEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "message_id")
    private UUID messageId;

    @ManyToOne
    @JoinColumn(name = "chatroom_id")
    private ChatRoomEntity chatRoom;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private MemberEntity sender;

    private String content;

    private LocalDateTime sendTime;
}