package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Model 클래스 패키지
import org.springframework.web.bind.annotation.GetMapping; // URL 연결 요청(@GetMapping())



@Controller // 컨트롤러 선언
public class FirstController {

    @GetMapping("/hi") // URL 요청 접수
    public String niceToMeetYou(Model model) { // model 객체 받아오기
        // 모델에서 변수를 등록할 때는 형식 : model.addAttribute("변수명", 변숫값)
        model.addAttribute("username", "홍광호");
        return "greetings"; // 서버가 알아서 greetings.mustache로 파일 변환
    }
}
