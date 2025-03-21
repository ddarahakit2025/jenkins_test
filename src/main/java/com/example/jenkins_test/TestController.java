package com.example.jenkins_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {
    @GetMapping("/ex01")
    public String ex01() {
        System.out.println("test");

        return "ex12";
    }
}
