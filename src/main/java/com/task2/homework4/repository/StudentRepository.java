package com.task2.homework4.repository;

import com.task2.homework4.domain.Student;

import java.util.ArrayList;

public interface StudentRepository {

    Student save(Student student);


    Student findById(Long id);


    void update(Student student);


    Student deleteById(Long id);


    ArrayList<Student> findByDepartment(Long id);

    ArrayList<Student> findByYear(int year);

    ArrayList<Student> findByGroup(String group);

    ArrayList<Student> findByDepartmentAndCourse(Long id, int course);


}
