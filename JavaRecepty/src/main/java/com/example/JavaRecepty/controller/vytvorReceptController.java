package com.example.JavaRecepty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class vytvorReceptController
{

    @GetMapping("/vytvorRecept")
    public String showVytvorReceptPage(){
        return "vytvorRecept";
    }

}
