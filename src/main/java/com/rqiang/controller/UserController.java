package com.rqiang.controller;

import com.rqiang.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
//@ComponentScan(basePackages = {"com.rqiang.controller"})
public class UserController {



    @GetMapping("/if-unless")
    public Object myUsers(Model model){
        List<User> users = new ArrayList<>();
        users.add(new User("rqiang1", "jx3hyun.com", "ADMIN"));
        users.add(new User("rqiang2", "jx3hyun.com", "USER"));
        users.add(new User("rqiang3", "jx3hyun.com", "USER"));
        users.add(new User("rqiang4", "jx3hyun.com", "USER"));

        model.addAttribute("users", users);
        return "if-unless";
    }
    @GetMapping("/switch-case")
    public Object mySwitch(Model model){
        List<User> users = new ArrayList<>();
        users.add(new User("rqiang1", "jx3hyun.com", "ADMIN"));
        model.addAttribute("users", users);
        return "switch-case";
    }
}
