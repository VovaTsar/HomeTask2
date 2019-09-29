package com.task.homework4.helper.validator.impl;

import com.task.homework4.helper.validator.Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator implements Validate {
    private final String PHONE_PATTERN = "[0-9]{12}";



    @Override
    public boolean validate(final String hex) {
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        Matcher matcher = pattern.matcher(hex);
        return matcher.matches();
    }
}
