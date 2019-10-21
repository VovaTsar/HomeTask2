package com.task.homework13.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.task.homework13.User;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class WorkWithJson {
    private static  final String FILE= "parseJson.json";

    public static void objToJson(User user){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(FILE)) {
            gson.toJson(user, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void jsonToObj(){
        Gson gson = new Gson();

        try (Reader reader = new FileReader(FILE)) {

            User user = gson.fromJson(reader, User.class);

            System.out.println(user);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
