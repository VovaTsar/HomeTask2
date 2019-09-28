package com.task.homework4.controller;

import com.task.homework4.domain.Student;
import com.task.homework4.repository.StudentRepository;
import com.task.homework4.repository.StudentRepositoryImpl;
import com.task.homework4.service.StudentService;
import com.task.homework4.service.StudentServiceImpl;

import java.util.ArrayList;

public class MainController {
    private StudentRepository studentRepository = StudentRepositoryImpl.getInstance();
    private StudentService studentService = StudentServiceImpl.getInstance(studentRepository);

    public Student register(Student student) {
        return studentService.register(student);
    }


    public Student findById(Long id) {

        return studentService.findById(id);
    }


    public void update(Student student) {

        studentService.update(student);
    }


    public Student deleteById(Long id) {

        return studentService.deleteById(id);
    }


    public ArrayList<Student> findByDepartment(Long id) {

        return studentService.findByDepartment(id);
    }


    public ArrayList<Student> findByYear(int year) {

        return studentService.findByYear(year);
    }


    public ArrayList<Student> findByGroup(String group) {

        return studentService.findByGroup(group);
    }


    public ArrayList<Student> findByDepartmentAndCourse(Long id, int course) {
        return studentService.findByDepartmentAndCourse(id, course);
    }
}
