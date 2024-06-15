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
import org.springframework.data.domain.Auditable;

import java.util.UUID;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "chatroom", schema = "chat")
public class ChatRoomEntity{

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "chatroom_id")
    private UUID chatroomId;

    @ManyToOne
    @JoinColumn(name = "sender_id", referencedColumnName = "member_id")
    private MemberEntity sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id", referencedColumnName = "member_id")
    private MemberEntity receiver;

}