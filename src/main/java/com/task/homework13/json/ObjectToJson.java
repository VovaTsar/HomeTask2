package com.task.homework13.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.task.homework13.User;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ObjectToJson {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        User user = new User("Vova", "Ts", 20, Arrays.asList("OOP", "Collections","MySQL","Spring"));

        try (FileWriter writer = new FileWriter("C:\\Users\\dropt\\Desktop\\parseJson.json")) {
            gson.toJson(user, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
