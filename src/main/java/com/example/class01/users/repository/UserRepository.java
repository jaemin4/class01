package com.example.class01.users.repository;

import com.example.class01.users.domain.dto.UserAuthManageResponseDto;
import com.example.class01.users.domain.dto.UserUpdateRequestDto;
import com.example.class01.users.domain.vo.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserRepository {
    Optional<Users> findByUsername(String username);

    void save(Users user);

    void updateAuth(UserUpdateRequestDto dto);

    List<UserAuthManageResponseDto> findUserForAuthManage();

    UserAuthManageResponseDto findById(Long id);
}
