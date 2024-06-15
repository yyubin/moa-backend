package com.loa.moabackend.Chat.model.entity;

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
    private UUID messageId;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private LocalDateTime sendTime;

    @ManyToOne
    @JoinColumn(name = "sender_id", referencedColumnName = "member_id")
    private MemberEntity sender;

    @ManyToOne
    @JoinColumn(referencedColumnName = "chatroom_id")
    private ChatRoomEntity chatRoom;
}
