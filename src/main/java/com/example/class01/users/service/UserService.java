package com.example.class01.users.service;

import com.example.class01.users.domain.dto.UserAuthManageResponseDto;
import com.example.class01.users.domain.dto.UserUpdateRequestDto;
import com.example.class01.users.domain.vo.Users;
import com.example.class01.users.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Transactional
    public void save(Users user) {
        String rawPassword = user.getPassword();
        String encodePassword = bCryptPasswordEncoder.encode(rawPassword);
        userRepository.save(user.toBuilder().password(encodePassword).build());
    }

    @Transactional
    public void updateAuth(UserUpdateRequestDto dto) {
        userRepository.updateAuth(dto);
    }

    public List<UserAuthManageResponseDto> findUserForAuthManage() {
        return userRepository.findUserForAuthManage();
    }

    public UserAuthManageResponseDto findById(Long id) {
        return userRepository.findById(id);
    }
}
