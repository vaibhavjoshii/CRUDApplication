package com.example.CRUD.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidCreatedByValidator implements ConstraintValidator<ValidCreatedBy, String> {

    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext){
        if(s.matches("[a-z0-9 .]+")){
            return true;
        } else {
            return false;
        }
    }
}
