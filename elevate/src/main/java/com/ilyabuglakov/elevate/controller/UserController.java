package com.ilyabuglakov.elevate.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    @PreAuthorize("hasAuthority('auth')")
    @GetMapping("/profile")
    public String getProfile(Model model, Principal principal){
        model.addAttribute("user", principal);
        return "profile";
    }

}
