package com.task.homework4.helper.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator implements Validate {
    private final String DATA_PATTERN = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";



    @Override
    public boolean validate(final String hex) {
        Pattern pattern = Pattern.compile(DATA_PATTERN);
        Matcher matcher = pattern.matcher(hex);
        return matcher.matches();
    }
}
