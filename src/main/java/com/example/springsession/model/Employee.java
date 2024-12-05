package com.example.springsession.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private Character gender;

    @Column(name = "age")
    private Integer age;

    @Column(name = "city_id")
    private Integer cityId;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "city_id", insertable = false, updatable = false)
    private City city;

}
