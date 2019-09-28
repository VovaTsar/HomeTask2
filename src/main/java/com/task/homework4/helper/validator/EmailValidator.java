package com.task.homework4.helper.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class EmailValidator implements Validate {
    private final String EMAIL_PATTERN = "[a-zA-Z0-9]{1,}[@]{1}[a-z]{5,}[.]{1}+[a-z]{3}";



    @Override
    public boolean validate(final String hex) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(hex);
        return matcher.matches();
    }
}
