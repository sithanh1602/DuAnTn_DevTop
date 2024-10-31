package com.be.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    String name ;
    String marks;
    String age;
    String ages;
    String agess;
    String date;
}
