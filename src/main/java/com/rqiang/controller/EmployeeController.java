package com.rqiang.controller;

import com.rqiang.domain.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
//@ComponentScan(basePackages = {"com.rqiang.controller"})
public class EmployeeController {



    @GetMapping("/iteration")
    public Object myBootstrap(Model model){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("rqiang1", "z1", "jx3hyun.com"));
        employees.add(new Employee("rqiang2", "z2", "jx3hyun.com"));
        employees.add(new Employee("rqiang3", "z3", "jx3hyun.com"));
        employees.add(new Employee("rqiang4", "z4", "jx3hyun.com"));

        model.addAttribute("employees", employees);
        return "iteration";
    }
}
