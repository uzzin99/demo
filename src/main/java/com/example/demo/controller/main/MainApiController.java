package com.example.demo.controller.main;

import com.example.demo.user.entity.Member;
import com.example.demo.user.repo.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class MainApiController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/apiTest")
    public Optional<Member> getUserById() {
        return null;
        //return memberRepository.findByUsername("uzzin");
    }
}
