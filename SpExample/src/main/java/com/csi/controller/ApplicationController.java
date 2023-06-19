package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

    @GetMapping
    public String sayS(){
        return "welcome to dandeli";
    }

    @GetMapping("/s")
    public String sayP(){
        return "full stack";
    }
@GetMapping("/psh")
    public String saySP(){
        return "csi pune";
}

}
