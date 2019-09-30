package com.task.homework4.helper.validator.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmailValidatorTest {
    @Test
    public void shouldReturnTrueIfEmailCorrect() {
        EmailValidator emailValidator = new EmailValidator();
        assertFalse(emailValidator.validate("fwefwefwq"));
        assertFalse(emailValidator.validate("fvdsdvsdvsv@"));
        assertFalse(emailValidator.validate("fvdsdsvv@fdvfd"));
        assertFalse(emailValidator.validate("fvdsv@fd32rvfd."));
        assertFalse(emailValidator.validate("fvdsv@fdweefvfd.vfdvfd"));
        assertFalse(emailValidator.validate("fvdsv@fefedvfd.vfdvfd."));
        assertFalse(emailValidator.validate("fvdsvfefdvfd.vfdvfd."));
        assertFalse(emailValidator.validate("fvdsv133fdvfd@.gmail.com"));
        assertFalse(emailValidator.validate("fvdsvfdvfdwef.@gmail.com"));

        assertTrue(emailValidator.validate("fvdsvfdfwvfd@gmail.com"));

    }
}