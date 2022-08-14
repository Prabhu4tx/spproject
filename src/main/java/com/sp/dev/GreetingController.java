package com.sp.dev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello SP pratice! Your application is running";
    }
}