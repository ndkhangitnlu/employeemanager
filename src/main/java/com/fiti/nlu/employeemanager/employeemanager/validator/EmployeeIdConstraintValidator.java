package com.fiti.nlu.employeemanager.employeemanager.validator;

import com.fiti.nlu.employeemanager.employeemanager.service.EmployeeService;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;


public class EmployeeIdConstraintValidator  implements ConstraintValidator<ExistEmployeeId,String> {
@Autowired
private EmployeeService employeeService;
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return !employeeService.existsEmployeeId(s);
    }
}
