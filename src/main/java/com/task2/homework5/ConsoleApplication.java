package com.task2.homework5;

import com.task2.homework5.service.TextServiceImpl;

public class ConsoleApplication {
    public static void main(String[] args) {
        System.out.println(new TextServiceImpl().convertStringToText("qwerty qwerty2.qwerty3.qwerty4"));
    }
}
