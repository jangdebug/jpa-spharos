package com.union.starbucks.auth.vo;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SignInResponseVo {

    private String accessToken;
    private String refreshToken;
    private String name;
    private String uuid;

}
