package com.gitlab.module.two;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerB {

    @RequestMapping("/")
    public String index() {
        return "Module B!";
    }

}
