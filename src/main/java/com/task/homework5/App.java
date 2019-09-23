package com.task.homework5;

import com.task.homework5.mysentence.Text;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String inputText = "Don't worry! Study hard!";
        Text text = new Text(inputText);
        System.out.println(text.toString());
        System.out.println(text.getTitle());
        text.suppText("Just do it");
        System.out.println(text.toString());
    }
}

