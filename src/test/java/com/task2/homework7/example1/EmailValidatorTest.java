package com.task2.homework7.example1;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmailValidatorTest {
    @Test
    public void shouldReturnTrueIfEmailCorrect() {
        assertFalse(EmailValidator.validate("fwefwefwq"));
        assertFalse(EmailValidator.validate("fvdsdvsdvsv@"));
        assertFalse(EmailValidator.validate("fvdsdsvv@fdvfd"));
        assertFalse(EmailValidator.validate("fvdsv@fd32rvfd."));
        assertFalse(EmailValidator.validate("fvdsv@fdweefvfd.vfdvfd"));
        assertFalse(EmailValidator.validate("fvdsv@fefedvfd.vfdvfd."));
        assertFalse(EmailValidator.validate("fvdsvfefdvfd.vfdvfd."));
        assertFalse(EmailValidator.validate("fvdsv133fdvfd@.gmail.com"));
        assertFalse(EmailValidator.validate("fvdsvfdvfdwef.@gmail.com"));

        assertTrue(EmailValidator.validate("fvdsvfdfwvfd@gmail.com"));
    }
}