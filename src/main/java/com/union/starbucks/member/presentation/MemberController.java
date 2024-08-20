package com.union.starbucks.member.presentation;

import com.union.starbucks.member.application.MemberService;
import com.union.starbucks.member.dto.MemberSignUpDto;
import com.union.starbucks.member.vo.MemberResponseVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/members")
public class MemberController {

    private final MemberService memberService;

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<MemberResponseVo> getMemberById(@PathVariable Long id) {
        MemberSignUpDto getMember = memberService.getMemberById(id);
        log.info("getMember : {}", getMember);
        MemberResponseVo memberResponseVo = getMember.toResponseVo();
        return ResponseEntity.ok(memberResponseVo);
    }
}
