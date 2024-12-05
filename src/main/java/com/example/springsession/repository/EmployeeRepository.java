package com.example.springsession.repository;

import com.example.springsession.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<City, Integer> {
}
