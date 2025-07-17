package com.ab.springWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//    req url mapping
    @RequestMapping("/")
//    if Controller not Restcontroller
//    @ResponseBody
    public String greet(){
        System.out.println("I am here.");
        return "Welcome to ab!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "We dont teach, we educate!!";
    }

}
