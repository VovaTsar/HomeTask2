package com.task.homework4.service;

import com.task.homework4.entity.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentService {

    ArrayList<Student> findByFaculty(String faculty, List<Student> students);

    ArrayList<Student> findByYear(int year, List<Student> students);

    ArrayList<Student> findByGroup(String group, List<Student> students);

    ArrayList<Student> findByFacultyAndCourse(String faculty, int course, List<Student> students);

    void printStudents(String info, List<Student> students);
}
