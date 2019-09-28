package com.task.homework4.helper.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CourseValidator implements Validate {
    private final String COURSE_PATTERN = "[1-6]{1}";



    @Override
    public boolean validate(final String hex) {
        Pattern pattern = Pattern.compile(COURSE_PATTERN);
        Matcher matcher = pattern.matcher(hex);
        return matcher.matches();
    }
}
