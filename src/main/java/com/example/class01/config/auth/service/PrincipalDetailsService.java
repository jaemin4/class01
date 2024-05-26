package com.example.class01.config.auth.service;

import com.example.class01.config.auth.domain.PrincipalDetails;
import com.example.class01.users.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PrincipalDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        PrincipalDetails principalDetails = userRepository.findByUsername(username).map(PrincipalDetails::new).orElse(null);
        System.out.println("check");
        System.out.println(principalDetails.getPassword());
        return principalDetails;
    }
}
