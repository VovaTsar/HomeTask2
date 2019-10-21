package com.task.homework13.json;

import com.task.homework13.User;

import java.util.Arrays;

public class Json {
    public static void main(String[] args) {
        WorkWithJson.objToJson(new User("Vova", "Ts", 21, Arrays.asList("OOP", "Collections","MySQL","Spring")));
        WorkWithJson.jsonToObj();
    }

}
