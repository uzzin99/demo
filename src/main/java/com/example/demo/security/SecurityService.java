package com.example.demo.security;

import USER_VO.User;
import com.example.demo.repo.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class SecurityService implements UserDetailsService {

    @Autowired
    MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        MyUserDetails result = MyUserDetails.builder()
                .USER_ID(User.getUSER_ID().toString())
                .PWD(User.getPWD().toString())
                .role(authorities)
                .build();

        return result;
    }
}
