package com.ilyabuglakov.elevate.controller;

import com.ilyabuglakov.elevate.model.registration.FormUserDTO;
import com.ilyabuglakov.elevate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getRegistrationPage() {
        return "registration";
    }

    @PostMapping("/new")
    public String registerUser(@ModelAttribute("user") @Valid FormUserDTO formUserDTO, Model model) {
        if (userService.saveUser(formUserDTO.asUser()))
            return "redirect:/auth/login";
        else {
            model.addAttribute("registrationFailed", formUserDTO.getUsername());
            return "registration";
        }
    }

}
