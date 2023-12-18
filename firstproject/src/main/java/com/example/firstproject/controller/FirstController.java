package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Model 클래스 패키지
import org.springframework.web.bind.annotation.GetMapping; // URL 연결 요청(@GetMapping())



@Controller // 1. 컨트롤러 선언
public class FirstController {

    @GetMapping("/hi") // 2. URL 요청 접수
    // 3. 메소드 수행
    public String niceToMeetYou(Model model) { // 4. model 객체 가져오기
        // 모델에서 변수를 등록할 때는 형식 : model.addAttribute("변수명", 변숫값)
        model.addAttribute("username", "홍광호"); // 5. 모델 변수 등록
        return "greetings"; // 6. 뷰 템플릿 페이지 변환
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "홍광호");
        return "goodbye";
    }

}
