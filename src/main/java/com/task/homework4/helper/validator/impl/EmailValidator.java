package com.task.homework4.helper.validator.impl;

import com.task.homework4.helper.validator.Validate;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component
public final class EmailValidator implements Validate {
    private static final Logger logger = LoggerFactory.getLogger(EmailValidator.class);
    private static final String EMAIL_PATTERN = "[a-zA-Z0-9]{1,}[@]{1}[a-z]{5,}[.]{1}+[a-z]{3}";



    @Override
    public boolean validate(final String hex) {
        logger.info("Validate Student email ");
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(hex);
        if (matcher.matches()) {
            logger.info("Email is correct");
        } else {
            logger.error("Email is not correct");
        }
        return matcher.matches();
    }
}
