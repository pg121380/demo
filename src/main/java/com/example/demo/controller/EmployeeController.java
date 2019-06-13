package com.example.demo.controller;

import com.example.demo.mapper.EducationMapper;
import com.example.demo.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private EducationMapper educationMapper;

    private int getEmployeeNumber(){
        return employeeMapper.getAllEmployees().size();
    }



}
