package com.union.starbucks.member.application;

import com.union.starbucks.member.domain.Member;
import com.union.starbucks.member.dto.MemberSignUpDto;

public interface MemberService {

    void signUp(MemberSignUpDto memberSignUpDto);
    Member getMemberById(Long id);
    Member getMemberByEmail(String email);

}
