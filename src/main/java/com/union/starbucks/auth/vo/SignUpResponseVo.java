package com.union.starbucks.auth.vo;

import com.union.starbucks.member.domain.Gender;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@ToString
@Getter
public class SignUpResponseVo {

    private Long id;
    private String email;
    private Date birth;
    private String name;
    private String phoneNumber;
    private String nickname;
    private String address;
    private Gender gender;

}
