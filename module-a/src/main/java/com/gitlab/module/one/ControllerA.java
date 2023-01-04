package com.gitlab.module.one;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerA {

    @RequestMapping("/")
    public String index() {
        return "Module A !";
    }

}
