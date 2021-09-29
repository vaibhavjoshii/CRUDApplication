package com.example.CRUD.Validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidCreatedByValidator.class)
@Documented
public @interface ValidCreatedBy{
    String message() default "Only lowercase(a-z) and numbers are allowed";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
