package com.example.springsession.service;

import com.example.springsession.model.Employee;
import com.example.springsession.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeImpl {

    private final EmployeeRepository repository;

    public List<Employee> allStringBase() {
        return repository.findEmployeeByCityId(1);
    }
}
