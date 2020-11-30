package com.ilyabuglakov.elevate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/")
public class WebController {

    @GetMapping
    public String index(Model model, Principal principal){
        model.addAttribute("user", principal);
        return "index";
    }

}
