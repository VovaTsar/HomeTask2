package com.task.service;


import com.task.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    ;

    private StudentService() {
    }

    private static class SingletonHolder {
        private final static StudentService instance = new StudentService();
    }

    public static StudentService getInstance() {
        return SingletonHolder.instance;
    }

    public void printStudents(String info, List<Student> students) {
        System.out.println(info + ":");
        for (Student student : students) {
            System.out.println(student);

        }
    }

    public ArrayList<Student> findByFaculty(String faculty, List<Student> students) {
        ArrayList<Student> findStudentsByFaculty = new ArrayList<>();
        for (Student student : students) {
            if (faculty.equals(student.getFaculty())) {
                findStudentsByFaculty.add(student);
            }
        }
        return findStudentsByFaculty;
    }

    public ArrayList<Student> findByYear(int year, List<Student> students) {
        ArrayList<Student> findStudentsByYear = new ArrayList<>();
        for (Student student : students) {
            if (year < student.getBirthday().getYear()) {
                findStudentsByYear.add(student);
            }
        }
        return findStudentsByYear;
    }


}
