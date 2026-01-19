package com.example.day2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@ResponseBody

public class Home {
    @GetMapping("/")
    public String hello() {
        return "index";
    }
    @GetMapping("/user")
    public String user() {
        return "user";
    }
    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
