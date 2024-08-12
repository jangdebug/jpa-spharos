package com.union.starbucks.member.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Gender {

    GENDER_MALE("남성"),
    GENDER_FEMALE("여성"),
    GENDER_ETC("기타");

    private final String gender;

}
