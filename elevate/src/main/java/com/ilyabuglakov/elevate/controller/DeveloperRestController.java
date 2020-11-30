package com.ilyabuglakov.elevate.controller;

import com.ilyabuglakov.elevate.model.Developer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/devs")
public class DeveloperRestController {
    static {
        System.out.println("Created");
    }

    private List<Developer> developers = Stream.of(
            new Developer(1, "Vasya", "Vasyliev"),
            new Developer(2, "Jenya", "Spicin"),
            new Developer(3, "Alex", "Rolex")
    ).collect(Collectors.toList());

    @GetMapping()
    public List<Developer> getAll(){
        return developers;
    }

    @GetMapping("{id}")
    public Developer getById(@PathVariable long id){
        return developers.stream()
                .filter(dev -> dev.getId() == id)
                .findFirst()
                .get();
    }
}
