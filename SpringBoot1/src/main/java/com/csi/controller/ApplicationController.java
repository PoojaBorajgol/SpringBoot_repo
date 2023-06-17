package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {
    @GetMapping
    public String sayS()
    {
        return "WELCOME TO DANDELI FOREST SP";
    }
    @GetMapping("/sh")
    public String sayP()
    {
        return "FULLSTACK JAVA DEVELOPEMENT";
    }

    @GetMapping("/p")
    public String saySP()
    {
        return "welcome to pune";
    }
}
