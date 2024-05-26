package com.example.class01.users.controller;

import com.example.class01.users.domain.dto.UserAuthManageResponseDto;
import com.example.class01.users.domain.dto.UserUpdateRequestDto;
import com.example.class01.users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    @GetMapping("/users/auth")
    public List<UserAuthManageResponseDto> findUserForAuthManage(){

        return userService.findUserForAuthManage();
    }

    @PutMapping("/users/auth")
    public void updateUserAuth(@RequestBody UserUpdateRequestDto dto){
        userService.updateAuth(dto);
    }
}
