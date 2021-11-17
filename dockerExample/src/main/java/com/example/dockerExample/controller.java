package com.example.dockerExample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping("/")
    public String greeting(){
        return "Iam running on docker";
    }
}
