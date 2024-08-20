package com.union.starbucks.auth.vo;

import lombok.*;

@ToString
@Getter
public class SignInRequestVo {

    private String email;
    private String password;

}
