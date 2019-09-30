package com.task.homework4.helper.validator.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataValidatorTest {

    @Test
    public void shouldReturnTrueIfDataIsCorrect() {
        DataValidator dataValidator=new DataValidator();
        assertFalse( dataValidator.validate("11.11.1997"));
        assertFalse(dataValidator.validate("77/15/2222"));
        assertFalse(dataValidator.validate("fvdsdsvv@fdvfd"));
        assertTrue(dataValidator.validate("07/09/2000"));
    }
}