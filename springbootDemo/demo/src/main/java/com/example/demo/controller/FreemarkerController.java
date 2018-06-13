package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by zsq on 2018/3/21.
 */
@Controller
@RequestMapping("freemarker")
public class FreemarkerController {

    @RequestMapping("hello")
    public String hello(Map<String,Object> map) {

        map.put("msg", "Hello Freemarker");
        return "hello";
    }

    @RequestMapping("helloworld")
    public String helloworld(Map<String,Object> map) {

        map.put("msg", "Hello World");
        return "hello";
    }
}