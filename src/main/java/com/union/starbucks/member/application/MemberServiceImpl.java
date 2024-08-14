package com.union.starbucks.member.application;

import com.union.starbucks.member.domain.Member;
import com.union.starbucks.member.dto.MemberSignUpDto;
import com.union.starbucks.member.infrastructure.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public void signUp(MemberSignUpDto memberSignUpDto) {
        log.info("memberSignUpDto : {}", memberSignUpDto);
        Member member = memberSignUpDto.toEntity();
        log.info("member : {}", member);
        memberRepository.save(member);
//        todo : memberSignUpDto를 Member로 변환하여 저장
    }

    @Override
    public MemberSignUpDto getMemberById(Long id) {

        log.info("id : {}", id);
        Member getMember = memberRepository.findById(id).orElseThrow();
        log.info("getMember : {}", getMember);
        MemberSignUpDto memberSignUpDto = MemberSignUpDto.builder()
                .id(getMember.getId())
                .email(getMember.getEmail())
                .password(getMember.getPassword())
                .name(getMember.getName())
                .phoneNumber(getMember.getPhone())
                .nickname(getMember.getNickname())
                .birth(getMember.getBirth())
                .address(getMember.getAddress())
                .gender(getMember.getGender())
                .build();
        log.info("memberSignUpDto : {}", memberSignUpDto);
        return memberSignUpDto;
    }

    @Override
    public MemberSignUpDto getMemberByEmail(String email) {
        Member member = memberRepository.findByEmail(email).orElseThrow(
                () -> new IllegalArgumentException("해당 이메일을 가진 회원이 없습니다.")
        );
        if (member != null) {
            MemberSignUpDto memberSignUpDto = MemberSignUpDto.builder()
                    .id(member.getId())
                    .email(member.getEmail())
                    .password(member.getPassword())
                    .name(member.getName())
                    .phoneNumber(member.getPhone())
                    .nickname(member.getNickname())
                    .birth(member.getBirth())
                    .address(member.getAddress())
                    .build();
            return memberSignUpDto;
        }
        return null;
    }
}
