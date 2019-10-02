package com.task.homework4.repository;

import com.task.homework4.domain.Student;

import java.util.ArrayList;
import java.util.Optional;

public interface StudentRepository {

    Optional<Student> save(Student student);


    Optional<Student> findById(Long id);

    Optional<Student> findByEmail(String email);

    ArrayList<Student> findAll();

    void update(Student student);


    Optional<Student> deleteById(Long id);


    ArrayList<Student> findByDepartment(Long id);

    ArrayList<Student> findByYear(int year);

    ArrayList<Student> findByGroup(String group);

    ArrayList<Student> findByDepartmentAndCourse(Long id, int course);


}
