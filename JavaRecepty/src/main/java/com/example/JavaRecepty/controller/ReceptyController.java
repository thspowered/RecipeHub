package com.example.JavaRecepty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReceptyController {

    @GetMapping("/receptyAll")
    public String showReceptyPage() {
        return "receptyAll";
    }


}
