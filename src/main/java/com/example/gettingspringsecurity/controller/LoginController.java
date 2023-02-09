package com.example.gettingspringsecurity.controller;

import com.example.gettingspringsecurity.entity.Patient;
import com.example.gettingspringsecurity.repository.PatientInfoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class LoginController {

    private PatientInfoRepository patientInfoRepository;
    @GetMapping("/login")
    String login(){
        return "login";
    }

    @GetMapping("/welcome")
    String  welcome(){
        return  "welcome";
    }
    @GetMapping("/register")
    String register(){
        return "register";
    }
    @GetMapping("/home")
    String home(){
        return "home";
    }
}
//