package com.example.springdemo.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = EmployeeCodeConstraint.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface EmployeeCode {
    String message() default "Invalid Employee Code, should start with RN";
    String value() default "RN";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}
