package com.fiti.nlu.employeemanager.employeemanager.validator;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = EmployeeIdConstraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface ExistEmployeeId {
    public String message() default "Mã nhân viên đã tồn tại!";
    //represents group of constraints
    public Class<?>[] groups() default {};
    //represents additional information about annotation
    public Class<? extends Payload>[] payload() default {};
}
