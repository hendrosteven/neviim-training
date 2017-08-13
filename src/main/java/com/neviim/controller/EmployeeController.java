/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neviim.controller;

import com.neviim.entity.Employee;
import com.neviim.service.EmployeeService;
import java.util.List;
import java.util.concurrent.Callable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.POST)
    public Callable<Employee> save(@RequestBody Employee employee) {
        return new Callable<Employee>() {
            @Override
            public Employee call() throws Exception {
                return employeeService.save(employee);
            }
        };
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> findAll() {
        List<Employee> response = employeeService.findAll();
        return response;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Callable<Employee> findById(@PathVariable("id") String id) {
        return new Callable<Employee>() {
            @Override
            public Employee call() throws Exception {
                return employeeService.findById(id);
            }
        };
    }
}
