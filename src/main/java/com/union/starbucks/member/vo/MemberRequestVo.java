package com.union.starbucks.member.vo;

import lombok.Getter;

import java.util.Date;

@Getter
public class MemberRequestVo {

    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private String nickname;
    private Date birth;
    private String address;
    private String gender;

}
