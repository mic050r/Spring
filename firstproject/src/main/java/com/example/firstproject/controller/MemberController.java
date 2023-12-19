package com.example.firstproject.controller;

import com.example.firstproject.dto.MemberForm;
import com.example.firstproject.entity.Member;
import com.example.firstproject.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class MemberController {
    @Autowired
    MemberRepository memberRepository;
    @GetMapping("/signup")
    public String signUpPage(){
        return "members/new";
    }

    @PostMapping("/join")
    public String Join(MemberForm form){
        Member member = form.toEntity();
        log.info(form.toString());
        // 2. 리파지터리로 엔티티를 DB에 저장
        Member saved = memberRepository.save(member); // article 엔티티를 저장해 saved 객체에 반환
        log.info(saved.toString());

        return "";
    }
}
