package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello") //hello라는 url받으면 이 컨트롤러 호출
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello"; //화면 이름 , resources/templates/hello.html
    }
}
