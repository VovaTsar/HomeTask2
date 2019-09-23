package com.task.homework4;

import com.task.homework4.entity.Student;
import com.task.homework4.init.StudentsInit;
import com.task.homework4.service.StudentServiceImpl;

import java.util.List;

public class Main {
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
