package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AlienController {
    @GetMapping("/")
    public String home (){
        System.out.println("this is a test");
        return "this is test";
    }

}
