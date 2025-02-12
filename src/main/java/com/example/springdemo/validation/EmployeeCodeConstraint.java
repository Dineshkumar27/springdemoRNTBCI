package com.example.springdemo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;

public class EmployeeCodeConstraint implements ConstraintValidator<EmployeeCode,String> {
    private String employeeCodeConstraint;
    @Override
    public void initialize(EmployeeCode employeeCode) {
        this.employeeCodeConstraint=employeeCode.value();//RN

    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        if(code !=null){
        result=code.startsWith(employeeCodeConstraint);
        }else {
            result=true;
        }

        return result;
    }
}
