package com.task.homework13.xml;

import com.task.homework13.User;

import java.util.Arrays;

public class Xml {
    public static void main(String[] args) {
        WorkWithXml.objectToXml(new User("Vova", "Ts", 20, Arrays.asList("OOP", "Collections", "MySQL", "Spring")));
        WorkWithXml.xmlToObj();
    }
}
