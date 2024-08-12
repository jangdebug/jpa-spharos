package com.union.starbucks.member.presentation;

import com.union.starbucks.member.application.MemberService;
import com.union.starbucks.member.dto.MemberSignUpDto;
import com.union.starbucks.member.vo.MemberRequestVo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/members")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/sign-up")
    public void signUp(@RequestBody MemberRequestVo memberRequestVo) {
//        MemberSignUpDto memberSignUpDto = MemberSignUpDto.builder()
//                .email(memberRequestVo.getEmail())
//                .password(memberRequestVo.getPassword())
//                .name(memberRequestVo.getName())
//                .phoneNumber(memberRequestVo.getPhoneNumber())
//                .nickname(memberRequestVo.getNickname())
//                .birth(memberRequestVo.getBirth())
//                .address(memberRequestVo.getAddress())
//                .build();
        ModelMapper modelMapper = new ModelMapper();
        MemberSignUpDto memberSignUpDto = modelMapper.map(memberRequestVo, MemberSignUpDto.class);
        memberService.signUp(memberSignUpDto);
    }

    @GetMapping("/{id}")
    public void getMemberById(@PathVariable Long id) {
        memberService.getMemberById(id);
    }
}
