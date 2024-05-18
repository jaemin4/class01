package com.example.class01.users.repository;

import com.example.class01.users.domain.vo.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface UserRepository {
    Optional<Users> findByUsername(String username);

    void save(Users user);
}
