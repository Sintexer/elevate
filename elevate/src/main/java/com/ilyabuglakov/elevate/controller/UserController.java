package com.ilyabuglakov.elevate.controller;

import com.ilyabuglakov.elevate.model.authentication.User;
import com.ilyabuglakov.elevate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PreAuthorize("hasAuthority('auth')")
    @GetMapping("/profile")
    public String getProfile(Model model, Principal principal) {
        User user = userService.getUser(principal.getName()).orElseThrow(() ->
                new UsernameNotFoundException(principal.getName() + " not found"));
        model.addAttribute("user", user);
        return "profile";
    }

}
