package com.task.homework4.helper.validator.impl;

import com.task.homework4.helper.validator.Validate;
import org.springframework.validation.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class IPv4Validator implements Validate {
    private static final String IPV4_PATTERN = "((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)";


    @Override
    public boolean validate(final String hex) {
        Pattern pattern = Pattern.compile(IPV4_PATTERN);
        Matcher matcher = pattern.matcher(hex);
        return matcher.matches();
    }
}
