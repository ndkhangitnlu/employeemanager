package com.fiti.nlu.employeemanager.employeemanager.repository;

import com.fiti.nlu.employeemanager.employeemanager.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {
}
