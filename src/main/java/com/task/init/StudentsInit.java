package com.task.init;

import com.task.entity.Person;
import com.task.entity.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class StudentsInit {


    private StudentsInit() {
    }

    public static List<Student> defaultInitStudent() {
        Person vovaTsarukperson = new Person.PersonBuilder()
                .withId(1)
                .withName("Vova")
                .withSurname("Tsaruk")
                .withPatronymic("Viktorovych")
                .withBirthday(LocalDate.of(1999, 6, 11))
                .build();

        Student vovaTsarukStudent = new Student.StudentBuilder()
                .withAddress("Kiev")
                .withTel("093333333333")
                .withFaculty("FICT")
                .withCourse(4)
                .withGroup("IP-64")
                .build(vovaTsarukperson);
        Person ivanZaichenkoPerson = new Person.PersonBuilder()
                .withId(1)
                .withName("Ivan")
                .withSurname("Zaichenko")
                .withPatronymic("Volodymyrovych")
                .withBirthday(LocalDate.of(1980, 1, 13))
                .build();

        Student ivanZaichenkoStudent = new Student.StudentBuilder()
                .withAddress("Kiev")
                .withTel("09311111111")
                .withFaculty("FICT")
                .withCourse(4)
                .withGroup("IP-64")
                .build(ivanZaichenkoPerson);

        Person vasylZaichenkoPerson = new Person.PersonBuilder()
                .withId(1)
                .withName("Vasyl")
                .withSurname("Zaichenko")
                .withPatronymic("Volodymyrovych")
                .withBirthday(LocalDate.of(1999, 1, 13))
                .build();

        Student vasylZaichenkoStudent = new Student.StudentBuilder()
                .withAddress("Kiev")
                .withTel("0932222222")
                .withFaculty("FICT")
                .withCourse(4)
                .withGroup("IP-64")
                .build(vasylZaichenkoPerson);

        List<Student> students = new ArrayList<>();

        students.add(vovaTsarukStudent);
        students.add(ivanZaichenkoStudent);
        students.add(vasylZaichenkoStudent);

        return students;
    }
}