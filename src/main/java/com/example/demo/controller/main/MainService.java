package com.example.demo.controller.main;

import com.example.demo.user.entity.Member;
import com.example.demo.user.repo.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    private MemberRepository memberRepository;

    public MainService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> getMemberList() throws Exception {
        return (List<Member>) memberRepository.findAll();
    }
}
