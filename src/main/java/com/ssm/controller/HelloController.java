package com.ssm.controller;

import com.ssm.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public  String hello(){
        helloService.helloSave();
        return "hello";
    }
}
