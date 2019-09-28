package com.task.homework7.console.entity;


import com.task.homework7.console.sort.BubbleSort;
import com.task.homework7.console.validator.EmailValidator;
import com.task.homework7.console.validator.Сonverter;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Menu {

    private static ArrayList<User> users = new ArrayList<>();
    private ResourceBundle lang;

    public void chooseMenuLang() {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose language/Оберіть мову");
        System.out.println("English (1)");
        System.out.println("Українська (2)");
        int chooseLanguage = in.nextInt();

        chooseLang(chooseLanguage);
    }

    void chooseLang(int in) {

        try {
            if (in == 1) {
                lang = ResourceBundle.getBundle("resources", new Locale("en"), new Сonverter());
            } else if (in == 2) {
                lang = ResourceBundle.getBundle("resources", new Locale("ua"), new Сonverter());
            } else
                chooseMenuLang();
        } catch (Exception e) {
            throw new IllegalArgumentException(lang.getString("uncorrectedArgument"));
        }
        menu();
    }

    void menu() {

        System.out.println(lang.getString("menu"));
        System.out.println("1 - " + lang.getString("viewStudent"));
        System.out.println("2 - " + lang.getString("addStudent"));
        System.out.println("3 - " + lang.getString("sortStudent"));
        System.out.println("4 - " + lang.getString("chooseLanguage"));
        Scanner in = new Scanner(System.in);

        int choice;
        try {
            choice = in.nextInt();
        } catch (Exception e) {
            throw new IllegalArgumentException(lang.getString("uncorrectedArgument"));
        }

        switch (choice) {
            case 1:
                printAllUsers();
                break;
            case 2:
                createUserFromConsole();
                break;
            case 3:
                sortUser();
                break;
            case 4:
                chooseMenuLang();
                break;
        }
        menu();
    }

    void printAllUsers() {
        if (users.isEmpty())
            System.out.println(lang.getString("noStudentYet"));
        else {
            System.out.println("\n" + lang.getString("listStudent"));
            for (User user : users
            ) {
                System.out.println(user);
            }
            System.out.println();
        }
    }

    void createUserFromConsole() {
        String nameStudent;
        String surnameStudent;
        int age;
        String email;

        Scanner in = new Scanner(System.in);

        try {
            System.out.println(lang.getString("nameStudent"));
            nameStudent = in.nextLine();

            System.out.println(lang.getString("surnameStudent"));
            surnameStudent = in.nextLine();

            email = writeEmail(in);

            System.out.println(lang.getString("ageStudent"));
            age = in.nextInt();

        } catch (Exception e) {
            throw new IllegalArgumentException(lang.getString("uncorrectedArgument"));
        }
        users.add(new User(nameStudent, surnameStudent, age, email));
        System.out.println(lang.getString("studentCreated") + "\n");

        menu();
    }

    void sortUser() {

        BubbleSort.sort(users);
        System.out.println(lang.getString("usersAreSorted") + "\n");
    }

    private String writeEmail(Scanner in) {

        System.out.println(lang.getString("emailStudent"));
        String email = in.nextLine();

        if (!EmailValidator.validate(email)) {
            System.out.println(lang.getString("uncorrectedEmail"));
            writeEmail(in);
        }


        return email;
    }
}
