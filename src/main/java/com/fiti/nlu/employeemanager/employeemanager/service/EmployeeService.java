package com.fiti.nlu.employeemanager.employeemanager.service;

import com.fiti.nlu.employeemanager.employeemanager.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("employeeService")
public interface EmployeeService {
    @Transactional
    List<Employee> getAllEmployees();
    @Transactional
    Optional<Employee> getEmployeeById(String employeeId);
    @Transactional
    void addEmployee(Employee employee);
    @Transactional
    void updateEmployee(Employee employee);
    @Transactional
    boolean existsEmployeeId(String s);
}
