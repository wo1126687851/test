package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsq on 2018/3/21.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello,启动方式是jar启动吗？";
    }

    @RequestMapping("/hello2")
    public String hello2() {
        return "hello,启动方式是jar启动";
    }

    @RequestMapping("/app/hello3")
    public String hello3() {
        return "hello,nihaoa!";
    }

}
