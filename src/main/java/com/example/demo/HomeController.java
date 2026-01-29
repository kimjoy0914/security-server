package com.example.demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        //return "home page";
        //return "home page 수정";
        //return "home page 두번째 수정";
        return "home page 세번째 수정";
    }
}
