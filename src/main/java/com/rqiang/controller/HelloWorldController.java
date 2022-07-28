package com.rqiang.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@ComponentScan(basePackages = {"com.rqiang.controller"})
public class HelloWorldController {

    @GetMapping("/hello")
    public Object myHello(Model model){
        model.addAttribute("msg", "Hello World");
        return "helloworld";
    }

    @GetMapping("/style")
    public Object myStyle(Model model){
        model.addAttribute("msg", "Hello World");
        return "add-css-js-demo";
    }

    @GetMapping("/bootstrap")
    public Object myBootstrap(Model model){
        model.addAttribute("msg", "Hello World");
        return "add-bootstrap";
    }
}
