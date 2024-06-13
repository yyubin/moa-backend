package com.loa.moabackend.core.support;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.UUID;

@Getter
@EqualsAndHashCode
@MappedSuperclass
public abstract class UuidBaseEntity implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid2")
    private UUID id;
}
