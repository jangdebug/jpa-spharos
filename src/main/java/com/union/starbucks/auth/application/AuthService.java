package com.union.starbucks.auth.application;

import com.union.starbucks.auth.dto.SignInResponseDto;
import com.union.starbucks.auth.vo.SignInRequestVo;
import com.union.starbucks.auth.vo.SignUpRequestVo;

public interface AuthService {

    void signUp(SignUpRequestVo signUpRequestVo);
    SignInResponseDto signIn(SignInRequestVo signInRequestVo);

}
