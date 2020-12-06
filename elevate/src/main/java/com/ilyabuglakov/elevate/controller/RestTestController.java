package com.ilyabuglakov.elevate.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestTestController {

    @PostMapping("createTest")
    public void createTest()

}
