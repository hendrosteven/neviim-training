/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neviim.repo;

import com.neviim.entity.Employee;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Hendro Steven
 */
public interface EmployeeRepo extends PagingAndSortingRepository<Employee, String> {

    @Query("SELECT e FROM Employee e")
    public List<Employee> findAllEmployee();
}
