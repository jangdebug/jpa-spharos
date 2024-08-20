package com.union.starbucks.auth.application;

import com.union.starbucks.auth.dto.SignInResponseDto;
import com.union.starbucks.auth.infrastructure.AuthRepository;
import com.union.starbucks.auth.vo.SignInRequestVo;
import com.union.starbucks.auth.vo.SignUpRequestVo;
import com.union.starbucks.member.domain.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class AuthServiceImpl implements AuthService{

    private final AuthRepository authRepository;
    private final AuthenticationManager authenticationManager;

    @Override
    public void signUp(SignUpRequestVo signUpRequestVo) {

    }

    @Override
    public SignInResponseDto signIn(SignInRequestVo signInRequestVo) {

        Member member = authRepository.findByEmail(signInRequestVo.getEmail()).orElseThrow(
                () -> new IllegalArgumentException("해당 이메일을 가진 회원이 없습니다.")
        );
        log.info("member : {}", member);
        authenticationManager.authenticate(
             new UsernamePasswordAuthenticationToken(
                     member.getUsername(),
                     signInRequestVo.getPassword()
             )
        );

        return null;
    }
}
