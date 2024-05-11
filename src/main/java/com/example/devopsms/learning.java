package com.example.devopsms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class learning {
    @GetMapping("/learning")
    public String getData() {return "I am Learning Devops";}
}
