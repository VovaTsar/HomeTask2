package com.task.homework4.service;


import com.task.homework4.domain.Student;
import com.task.homework4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student register(Student student) {
        if (student == null) {
            throw new IllegalArgumentException(" Student is null");
        }
        return studentRepository.save(student);
    }

    @Override
    public Student findById(Long id) {
        if (id < 0) {
            throw new IllegalArgumentException("id must be > 0");
        }
        return studentRepository.findById(id);
    }

    @Override
    public ArrayList<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void update(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("");
        }
        studentRepository.update(student);
    }

    @Override
    public Student deleteById(Long id) {
        if (id < 0) {
            throw new IllegalArgumentException("id must be > 0");
        }
        return studentRepository.deleteById(id);
    }

    @Override
    public ArrayList<Student> findByDepartment(Long id) {
        if (id < 0) {
            throw new IllegalArgumentException("id must be > 0");
        }
        return studentRepository.findByDepartment(id);
    }

    @Override
    public ArrayList<Student> findByYear(int year) {
        if (year < 1920) {
            throw new IllegalArgumentException("id must be > 0");
        }
        return studentRepository.findByYear(year);
    }

    @Override
    public ArrayList<Student> findByGroup(String group) {
        if (group == null) {
            throw new IllegalArgumentException("Group is null");
        }
        return studentRepository.findByGroup(group);
    }

    @Override
    public ArrayList<Student> findByDepartmentAndCourse(Long id, int course) {
        if (id < 0 || course > 6 || course < 0) {
            throw new IllegalArgumentException("Course must be in range 1 to 6 and Id must be >0");
        }
        return studentRepository.findByDepartmentAndCourse(id, course);
    }
}
