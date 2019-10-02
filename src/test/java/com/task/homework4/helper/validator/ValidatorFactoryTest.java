package com.task.homework4.helper.validator;

import com.task.homework4.helper.validator.impl.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidatorFactoryTest {
    @Test
    public void shouldReturnCorrectTypeOfValidator() {
        assertEquals(ValidatorFactory.getValidator("name").getClass(), NameValidator.class);
        assertEquals(ValidatorFactory.getValidator("email").getClass(), EmailValidator.class);
        assertEquals(ValidatorFactory.getValidator("surname").getClass(), SurnameValidator.class);
        assertEquals(ValidatorFactory.getValidator("phoneNumber").getClass(), PhoneValidator.class);
        assertEquals(ValidatorFactory.getValidator("date").getClass(), DataValidator.class);
        assertEquals(ValidatorFactory.getValidator("course").getClass(), CourseValidator.class);

    }
}