package com.task.homework4.helper.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidator implements Validate {
    private final String NAME_PATTERN = "[a-zA-Z]{2,}";



    @Override
    public boolean validate(final String hex) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(hex);
        return matcher.matches();
    }
}
