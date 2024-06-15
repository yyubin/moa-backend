package com.loa.moabackend.Member.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;

import static com.loa.moabackend.Member.model.policy.Accounts.InvalidationMessage.PASSWORD_MESSAGE;
import static com.loa.moabackend.Member.model.policy.Accounts.Validation.PASSWORD;


public record SignUpDto() {
    @Builder
    public record SignUpRequestDto(
            @NotBlank
            String email,

            @NotBlank
            @Pattern(regexp = PASSWORD, message = PASSWORD_MESSAGE)
            String password,

            @NotBlank
            String nickname

    ) {}

    @Builder
    public record SignUpResponseDto(
//          @Expose -> jsonInclude 등의 조치를 더 이상 하지 않고 null을 담아서 주면 알아서 제외된다.
            Boolean success
    ) {}
}
