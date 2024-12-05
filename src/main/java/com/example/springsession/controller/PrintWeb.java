package com.example.springsession.controller;

import com.example.springsession.model.Employee;
import com.example.springsession.service.EmployeeImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PrintWeb {

    private final EmployeeImpl employee;

    @GetMapping("/print")
    public List<Employee> printText() {
        return employee.allStringBase();
    }
}
