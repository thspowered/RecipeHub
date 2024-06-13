package com.example.JavaRecepty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IngredienceAllController {

    @GetMapping("/ingredienceAll")
    public String showIngrediencePage() {
        return "ingredienceAll";
    }
}
