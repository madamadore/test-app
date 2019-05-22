package it.cutaway.example.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class HelloController {

    @Autowired
    private Environment env;

    @RequestMapping("/")
    public String index() {
        return env.getProperty("application.greetings");
    }

}
