package com.guimaraes.first_spring_app.controller;

import com.guimaraes.first_spring_app.domain.User;
import com.guimaraes.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Guilherme");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestBody User body, @RequestParam String filter){
        return "Hello World " + body.getName() + id;
    }
}
