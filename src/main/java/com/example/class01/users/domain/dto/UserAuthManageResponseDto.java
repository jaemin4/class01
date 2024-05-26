package com.example.class01.users.domain.dto;

import com.example.class01.users.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserAuthManageResponseDto {
    private Long id;
    private String username;
    private String email;
    private Role role;
}
