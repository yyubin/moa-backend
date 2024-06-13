package com.loa.moabackend.Member.model.entity;

import com.loa.moabackend.Member.model.CertificationCheck;
import com.loa.moabackend.Member.model.MemberStatus;
import com.loa.moabackend.core.support.UuidBaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
@Data
@Table(name = "member", schema = "auth")
public class MemberEntity extends UuidBaseEntity {

    /** 계정 **/
    private String username;

    private String password;

    private String nickname;

    /** EnumType.STRING을 적지 않는다면 Ordinal 값으로 들어감 **/

    @Enumerated(EnumType.STRING)
    private MemberStatus status;

    /** 변수명을  매퍼에서도 동일하게 사용해야함 그렇지 않을시엔 null값이 들어감으로 따로 타겟 지정 필요 **/
    @Enumerated(EnumType.STRING)
    @Column(name = "certification_check")
    private CertificationCheck certificationCheck;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

}
