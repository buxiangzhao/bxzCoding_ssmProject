package com.ssm.controller;

import com.ssm.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController extends BaseController{

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public  String hello(){
        logger.debug("debug-输出");
        logger.info("info-输出");
        logger.error("error-输出");
        helloService.helloSave();
        return "hello";
    }
}
