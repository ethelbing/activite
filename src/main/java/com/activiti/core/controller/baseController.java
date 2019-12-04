package com.activiti.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class baseController {

    @GetMapping("/hello")
    public String retHellp(){
        return "hello ";
    }
}
