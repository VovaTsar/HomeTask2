package com.task.homework4.init;


import com.task.homework4.domain.Address;
import com.task.homework4.domain.Department;
import com.task.homework4.domain.Student;
import com.task.homework4.repository.StudentRepository;
import com.task.homework4.repository.StudentRepositoryImpl;
import com.task.homework4.service.StudentService;
import com.task.homework4.service.StudentServiceImpl;

import java.time.LocalDate;

public class Menu {
    private StudentRepository studentRepository = StudentRepositoryImpl.getInstance();
    private StudentService studentService = StudentServiceImpl.getInstance(studentRepository);


    public void run() {
        Department department = new Department(7L, "kpi");
        Student vova = Student.builder()
                .withName("Vova")
                .withSurname("Ts")
                .withBirthday(LocalDate.of(1999, 6, 11))
                .withGroup("IP-64")
                .withAddress(new Address("Kyiv", "WWW", 7))
                .withPhoneNumber("3807341345")
                .withDepartment(department)
                .withEmail("adddfeewdw@gamil.com")
                .withCourse(4)
                .build();

        Student vania = Student.builder()
                .withName("Vania")
                .withSurname("Zaichenko")
                .withBirthday(LocalDate.of(1999, 1, 13))
                .withGroup("IP-64")
                .withAddress(new Address("Kyiv", "WWW", 8))
                .withPhoneNumber("38043545345")
                .withDepartment(department)
                .withCourse(4)
                .withEmail("adadwdw@gamil.com")
                .build();

        Student vasyl = Student.builder()
                .withName("Vasyl")
                .withSurname("Zaichenko")
                .withBirthday(LocalDate.of(1999, 1, 13))
                .withGroup("IP-64")
                .withAddress(new Address("Kyiv", "WWW", 8))
                .withPhoneNumber("38063355345")
                .withDepartment(department)
                .withEmail("edqddwdw@gamil.com")
                .withCourse(4)
                .build();
        studentService.register(vova);
        studentService.register(vasyl);
        studentService.register(vania);

    }
}
