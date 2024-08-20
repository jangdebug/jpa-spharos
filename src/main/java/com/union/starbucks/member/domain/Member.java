package com.union.starbucks.member.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Comment;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Getter
@Entity
@ToString
@NoArgsConstructor
public class Member implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Comment("회원 이름")
    @Column(nullable = false, length = 100)
    private String name;
    @Comment("회원 닉네임")
    @Column(length = 100)
    private String nickname;
    @Comment("회원 생년월일")
    @Column(nullable = false, length = 20)
    private Date birth;
    @Comment("회원 전화번호")
    @Column(nullable = false, length = 30)
    private String phone;
    @Comment("회원 이메일")
    @Column(nullable = false, length = 100)
    private String email;
    @Comment("회원 비밀번호")
    @Column(nullable = false, length = 100)
    private String password;
    @Comment("회원 주소")
    @Column(nullable = false, length = 100)
    private String address;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Builder
    public Member(
            Long id,
            String name,
            String nickname,
            Date birth,
            String phone,
            String email,
            String password,
            String address,
            Gender gender
    ) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.birth = birth;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.address = address;
        this.gender = gender;
    }

    public void hashPassword(String password) {
        this.password = new BCryptPasswordEncoder().encode(password);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
//        List<GrantedAuthority> authorities = new ArrayList<>();
        return List.of();
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
