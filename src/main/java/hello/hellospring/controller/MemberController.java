package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

// Spring 컨테이너에 @Controller 가 있으면  MemberController 객체를 생성해 스프링 빈 객체로 관리한다
@Controller
public class MemberController {

//    private final MemberService memberService = new MemberService();

        private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
