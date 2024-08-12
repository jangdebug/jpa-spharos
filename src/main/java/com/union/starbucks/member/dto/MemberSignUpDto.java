package com.union.starbucks.member.dto;

import com.union.starbucks.member.domain.Gender;
import com.union.starbucks.member.domain.Member;
import com.union.starbucks.member.vo.MemberRequestVo;
import com.union.starbucks.member.vo.MemberResponseVo;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class MemberSignUpDto {

    private Long id;
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
                .id(id)
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

    public MemberResponseVo toResponseVo() {
        return MemberResponseVo.builder()
                .id(id)
                .email(email)
                .name(name)
                .phoneNumber(phoneNumber)
                .nickname(nickname)
                .birth(birth)
                .address(address)
                .gender(gender)
                .build();
    }

}
