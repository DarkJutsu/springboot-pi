package com.samllo95.curso_springboot.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyRestController {
    @GetMapping("/")
    public String greeting(){
        return "index";
    }
}