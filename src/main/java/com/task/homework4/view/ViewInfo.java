package com.task.homework4.view;

import com.task.homework4.controller.MainController;
import com.task.homework4.domain.Address;
import com.task.homework4.domain.Department;
import com.task.homework4.domain.Student;
import com.task.homework4.helper.localization.Сonverter;
import com.task.homework4.helper.sort.BubbleSort;
import com.task.homework4.helper.validator.ValidatorFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ViewInfo {

    private MainController mainController = new MainController();
    private Scanner in = new Scanner(System.in);

    public void run() {
        chooseMenuLang();
    }

    private ResourceBundle lang;

    public void chooseMenuLang() {
        System.out.println("Choose language/Оберіть мову");
        System.out.println("English (1)");
        System.out.println("Українська (2)");
        int chooseLanguage = in.nextInt();

        chooseLang(chooseLanguage);
    }

    void chooseLang(int chooseLang) {

        try {
            if (chooseLang == 1) {
                lang = ResourceBundle.getBundle("resources", new Locale("en"), new Сonverter());
            } else if (chooseLang == 2) {
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

        int choice;
        try {
            choice = in.nextInt();
        } catch (Exception e) {
            throw new IllegalArgumentException(lang.getString("uncorrectedArgument"));
        }

        switch (choice) {
            case 1:
                printAllUsers(BubbleSort.sort(mainController.findAll()));
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

    void printAllUsers(ArrayList<Student> students) {
        if (mainController.findAll().isEmpty())
            System.out.println(lang.getString("noStudentYet"));
        else {
            System.out.println("\n" + lang.getString("listStudent"));
            for (Student student : students
            ) {
                System.out.println(student);
            }
            System.out.println();
        }
    }

    void createUserFromConsole() {

        String name = writeFieldValidator("name");
        String surname = writeFieldValidator("surname");
        String email = writeFieldValidator("email");
        String phoneNumber = writeFieldValidator("phoneNumber");
        String birthday = writeFieldValidator("date");
        Department department = new Department(1L, "dep1");
        System.out.println(lang.getString("groupStudent"));
        String group = in.nextLine();
        int course = Integer.parseInt(writeFieldValidator("course"));

        Student student = Student.builder()
                .withName(name)
                .withSurname(surname)
                .withBirthday(splitBirthday(birthday))
                .withDepartment(department)
                .withPhoneNumber(phoneNumber)
                .withGroup(group)
                .withCourse(course)
                .withEmail(email)
                .build();
        mainController.register(student);
        System.out.println(lang.getString("studentCreated") + "\n");

        menu();
    }

    LocalDate splitBirthday(String birthday) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(birthday, formatter);
    }

    void sortUser() {
        System.out.println(lang.getString("usersAreSorted") + "\n");
        printAllUsers( BubbleSort.sort(mainController.findAll()));
    }

    private String writeFieldValidator(String nameField) {

        String key = nameField + "Student";
        System.out.println(lang.getString(key));
        String fieldInput = in.nextLine();
        if (!ValidatorFactory.getValidator(nameField).validate(fieldInput)) {
            System.out.println(lang.getString("uncorrectedValue"));
            fieldInput = writeFieldValidator(nameField);
        }
        return fieldInput;
    }

    public void print(ArrayList<Student> students) {
        for (Student student : students) {
            print(student);
        }
    }

    public void print(Student students) {
        System.out.println(students);
    }
}
