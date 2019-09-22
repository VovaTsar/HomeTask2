package com.task.service;


import com.task.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentServiceImpl() {
    }

    private static class SingletonHolder {
        private final static StudentServiceImpl instance = new StudentServiceImpl();
    }

    public static StudentServiceImpl getInstance() {
        return SingletonHolder.instance;
    }

    public void printStudents(String info, List<Student> students) {
        System.out.println(info + ":");
        for (Student student : students) {
            System.out.println(student);

        }
    }

    public ArrayList<Student> findByFaculty(String faculty, List<Student> students) {
        if (students == null) {
            throw new NullPointerException("Empty");
        }
        ArrayList<Student> findStudentsByFaculty = new ArrayList<>();
        for (Student student : students) {
            if (faculty.equals(student.getFaculty())) {
                findStudentsByFaculty.add(student);
            }
        }
        return findStudentsByFaculty;
    }

    public ArrayList<Student> findByYear(int year, List<Student> students) {
        if (students == null) {
            throw new NullPointerException("Empty");
        }
        ArrayList<Student> findStudentsByYear = new ArrayList<>();
        for (Student student : students) {
            if (year < student.getBirthday().getYear()) {
                findStudentsByYear.add(student);
            }
        }
        return findStudentsByYear;
    }

    public ArrayList<Student> findByGroup(String group, List<Student> students) {
        if (students == null) {
            throw new NullPointerException("Empty");
        }
        ArrayList<Student> findStudentsByGroup = new ArrayList<>();
        for (Student student : students
        ) {
            if (group.equals(student.getGroup())) {
                findStudentsByGroup.add(student);
            }
        }
        return findStudentsByGroup;
    }

    public ArrayList<Student> findByFacultyAndCourse(String faculty, int course, List<Student> students) {
        if (students == null) {
            throw new NullPointerException("Empty");
        }
        ArrayList<Student> findStudentsByFacultyAndCourse = new ArrayList<>();
        for (Student student : students
        ) {
            if (faculty.equals(student.getFaculty()) && course == student.getCourse()) {
                findStudentsByFacultyAndCourse.add(student);
            }
        }
        return findStudentsByFacultyAndCourse;
    }

}
