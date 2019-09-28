package com.task.homework8;

public class Reflection {
    private final int id = 10;
    private  static String name = "Vova";
    public  static final  int age = 20;
    public  String getStaticField() {
        return name;
    }

    public int getId() {
        return id;
    }
}
