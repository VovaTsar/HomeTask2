package com.task.homework4.helper.validator;

import com.task.homework4.helper.validator.impl.*;

public final class ValidatorFactory {

    public static Validate getValidator(String field) {
        switch (field) {
            case "email":
                return new EmailValidator();
            case "name":
                return new NameValidator();
            case "surname":
                return new SurnameValidator();
            case "phoneNumber":
                return new PhoneValidator();
            case "date":
                return new DataValidator();
            case "course":
                return new CourseValidator();
        }
        throw new IllegalArgumentException();
    }
}
