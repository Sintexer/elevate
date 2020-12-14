package com.ilyabuglakov.elevate.controller;

import com.ilyabuglakov.elevate.model.test.Test;
import com.ilyabuglakov.elevate.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestTestController {

    @Autowired
    private TestService testService;

    @PostMapping("/createTest")
    public ResponseEntity<String> createTest(@RequestBody Test test){
        if(testService.saveTest(test))
            return ResponseEntity.ok("Test added");
        else
            return ResponseEntity.ok("Test with such name already exist");
    }

}
