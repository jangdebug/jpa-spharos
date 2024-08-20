package com.union.starbucks.auth.dto;

import com.union.starbucks.member.domain.Gender;
import com.union.starbucks.member.domain.Member;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class SignUpRequestDto {

    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private String nickname;
    private Date birth;
    private String address;
    private Gender gender;

    public Member toEntity() {
        return Member.builder()
                .email(email)
                .password(password)
                .name(name)
                .phone(phoneNumber)
                .nickname(nickname)
                .birth(birth)
                .gender(gender)
                .address(address)
                .build();
    }

}
