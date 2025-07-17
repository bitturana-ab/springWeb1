package com.ab.springWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        System.out.println("I am here.");
        return "Welcome to ab!!";
    }

}
