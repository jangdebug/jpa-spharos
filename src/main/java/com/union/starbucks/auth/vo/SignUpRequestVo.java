package com.union.starbucks.auth.vo;

import com.union.starbucks.member.domain.Gender;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@ToString
@Getter
public class SignUpRequestVo {

    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private String nickname;
    private Date birth;
    private String address;
    private Gender gender;

}
