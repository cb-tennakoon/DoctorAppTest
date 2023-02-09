package com.example.doctorAppTest.controller;

import com.example.doctorAppTest.repository.PatientInfoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    //private PatientInfoRepository patientInfoRepository;
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