package com.task.homework5;

import com.task.homework5.service.TextServiceImpl;

public class ConsoleApplicationForText {
    public static void main(String[] args) {
        System.out.println(new TextServiceImpl().convertStringToText("qwerty qwerty2.qwerty3.qwerty4"));
    }
}
