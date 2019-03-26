package com.sk.web.controllers;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("message", "dzien dobry");
        return "main";
    }

    @RequestMapping("/siemanko")
    public String index() {
        return "Greetings test!";
    }
}
