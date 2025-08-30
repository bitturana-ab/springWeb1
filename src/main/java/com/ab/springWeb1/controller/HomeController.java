package com.ab.springWeb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// transfer the page or layout
//@Controller
// transfer only REST data not layout
@RestController
public class HomeController {

//    for frontend page use JSP or react
//    req url mapping
    @RequestMapping("/")
//    if Controller not Restcontroller
//    @ResponseBody
    public String greet(){
        System.out.println("I am here.");
        return "Welcome to ab!!";
    }
    @RequestMapping("/ab")
    public String factorial(){
        return "ab didn't go to college...";
    }

    @RequestMapping("/about")
    public String about(){
        return "We dont teach, we educate!!";
    }

}
