/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neviim.service;

import com.neviim.entity.Employee;
import com.neviim.repo.EmployeeRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service("employeeService")
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    public Employee save(Employee employee) {
        return repo.save(employee);
    }

    public List<Employee> findAll() {
        return repo.findAllEmployee();
    }
    
    public Employee findById(String id){
        return repo.findOne(id);
    }
}
