package com.task2.homework5.service;

import com.task2.homework5.domain.Text;

import static java.util.Objects.isNull;

public class TextServiceImpl implements TextService {
    @Override
    public Text convertStringToText(String text) {
      throw new UnsupportedOperationException("");
    }

    @Override
    public String convertTextToString(Text text) {
        return isNull(text) ? null : text.toString();
    }
}