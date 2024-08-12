package com.union.starbucks.member.vo;


import com.union.starbucks.member.domain.Gender;
import lombok.*;

import java.util.Date;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberResponseVo {
    private Long id;
    private String email;
    private Date birth;
    private String name;
    private String phoneNumber;
    private String nickname;
    private String address;
    private Gender gender;

}
