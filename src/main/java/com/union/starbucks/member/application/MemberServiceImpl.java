package com.union.starbucks.member.application;

import com.union.starbucks.member.domain.Member;
import com.union.starbucks.member.dto.MemberSignUpDto;
import com.union.starbucks.member.infrastructure.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public void signUp(MemberSignUpDto memberSignUpDto) {
        Member member = memberSignUpDto.toEntity();
//        todo : memberSignUpDto를 Member로 변환하여 저장
    }

    @Override
    public Member getMemberById(Long id) {
//        Member member = memberRepository.findById(id);
        return null;
    }

    @Override
    public Member getMemberByEmail(String email) {
        Member member = memberRepository.findByEmail(email);
        return null;
    }
}
