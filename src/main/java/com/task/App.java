package com.task;

import com.task.entity.Student;
import com.task.init.StudentsInit;
import com.task.service.StudentServiceImpl;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Student> students = StudentsInit.defaultInitStudent();
        List<Student> foundStudents;

        StudentServiceImpl studentServiceImpl = StudentServiceImpl.getInstance();
        foundStudents = studentServiceImpl.findByFaculty("FICT", students);
        studentServiceImpl.printStudents("Students find by faculty", foundStudents);

        foundStudents = studentServiceImpl.findByYear(1990, students);
        studentServiceImpl.printStudents("Students find by year", foundStudents);

        foundStudents = studentServiceImpl.findByGroup("IP-64", students);
        studentServiceImpl.printStudents("Students find by group", foundStudents);

        foundStudents = studentServiceImpl.findByFacultyAndCourse("FICT", 4, students);
        studentServiceImpl.printStudents("Students find by faculty and course", foundStudents);
    }
}

