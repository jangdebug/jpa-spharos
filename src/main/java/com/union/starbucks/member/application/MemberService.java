package com.union.starbucks.member.application;

import com.union.starbucks.member.domain.Member;
import com.union.starbucks.member.dto.MemberSignUpDto;

public interface MemberService {

    void signUp(MemberSignUpDto memberSignUpDto);
    MemberSignUpDto getMemberById(Long id);
    MemberSignUpDto getMemberByEmail(String email);

}
