package com.task.homework4.helper.validator.impl;

import com.task.homework4.helper.validator.Validate;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class IPv6Validator implements Validate {

    private final String IPV6_PATTERN = "((^|:)([0-9a-fA-F]{0,4})){1,8}$";


    @Override
    public boolean validate(final String hex) {
        Pattern pattern = Pattern.compile(IPV6_PATTERN);
        Matcher matcher = pattern.matcher(hex);
        return matcher.matches();

    }
}
