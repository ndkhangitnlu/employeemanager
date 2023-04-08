package com.fiti.nlu.employeemanager.employeemanager.service;

import com.fiti.nlu.employeemanager.employeemanager.entity.Employee;
import com.fiti.nlu.employeemanager.employeemanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("employeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployees() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(String employeeId) {
        return employeeRepository.findById(employeeId);
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public boolean existsEmployeeId(String s) {
        return employeeRepository.existsById(s);
    }
}
