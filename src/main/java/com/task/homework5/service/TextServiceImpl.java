package com.task.homework5.service;

import com.task.homework5.domain.Text;

import static java.util.Objects.isNull;

public class TextServiceImpl implements TextService {
    @Override
    public Text convertStringToText(String text) {
     return  new Text().split(text);
    }

    @Override
    public String convertTextToString(Text text) {
        return isNull(text) ? null : text.toString();
    }
}
