package com.guimaraes.first_spring_app.service;

import com.guimaraes.first_spring_app.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class HelloWorldService {

    public String helloWorld(String name){
        return "Hello, World!" + name;
    }

}
