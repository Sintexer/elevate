package com.ilyabuglakov.elevate.controller;

import com.ilyabuglakov.elevate.model.test.Test;
import com.ilyabuglakov.elevate.model.test.UserAnswersDTO;
import com.ilyabuglakov.elevate.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @PreAuthorize("hasAuthority('auth')")
    @GetMapping("/{id}")
    public String getTestPage(@RequestParam Long testId, Model model){
        Optional<Test> test = testService.getTest(testId);
        if(!test.isPresent()){
            return "404";
        }
        model.addAttribute("test", test.get());
        return "testPage";
    }

    @PreAuthorize("hasAuthority('auth')")
    @PostMapping("/check")
    private String checkTest(@RequestBody UserAnswersDTO userAnswersDTO){
        return "index";
    }

}
