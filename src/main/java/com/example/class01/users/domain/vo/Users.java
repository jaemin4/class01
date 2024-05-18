package com.example.class01.users.domain.vo;

import com.example.class01.users.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@Builder(toBuilder = true)
@ToString
public class Users {
    private Long id;
    private String username;
    private String email;
    private String picture;
    private String password;
    private Role role;
}
