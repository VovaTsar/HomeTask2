package com.task;

import com.task.entity.Student;
import com.task.init.StudentsInit;
import com.task.service.StudentService;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Student> students = StudentsInit.defaultInitStudent();
        List<Student> foundStudents;

        StudentService studentService = StudentService.getInstance();
        foundStudents = studentService.findByFaculty("FICT", students);
        studentService.printStudents("Students find by faculty", foundStudents);

        foundStudents = studentService.findByYear(1990, students);
        studentService.printStudents("Students find by year", foundStudents);

        foundStudents = studentService.findByGroup("IP-64", students);
        studentService.printStudents("Students find by group", foundStudents);
    }
}

