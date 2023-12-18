package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping; // URL 연결 요청(@GetMapping())



@Controller // 컨트롤러 선언
public class FirstController {

    @GetMapping("/hi") // URL 요청 접수
    public String niceToMeetYou() { // 메소드 작성
        return "greetings"; // 서버가 알아서 greetings.mustache로 파일 변환
    }
}
