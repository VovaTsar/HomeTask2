package com.task2.homework5.service;

import com.task2.homework5.domain.Text;

public interface TextService {
    Text convertStringToText(String text);

    String convertTextToString(Text text);
}
