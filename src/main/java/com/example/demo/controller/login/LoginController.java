package com.example.demo.controller.login;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {

        return "login";
    }

    @Service
    @RequiredArgsConstructor
    public static class loginService {


    }
}
