package com.example.class01.users.domain.dto;

import com.example.class01.users.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateRequestDto {
    private Long id;
    private Role role;
}
