package com.task.homework13.json;

import com.google.gson.Gson;
import com.task.homework13.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class JsonToObject {
    public static void main(String[] args) {
        Gson gson = new Gson();

        try (Reader reader = new FileReader("C:\\Users\\dropt\\Desktop\\parseJson.json")) {

            User user = gson.fromJson(reader, User.class);

            System.out.println(user);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
