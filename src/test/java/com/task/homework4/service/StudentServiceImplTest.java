package com.task.homework4.service;

import com.task.homework4.entity.Student;
import com.task.homework4.init.StudentsInit;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StudentServiceImplTest {



    @Test
    public void findByFaculty() {
        List<Student> expectedStudents = StudentsInit.defaultInitStudent();
        StudentServiceImpl studentServiceImpl = StudentServiceImpl.getInstance();
        List<Student> actualStudents=studentServiceImpl.findByFaculty("FICT",expectedStudents);
        expectedStudents.remove(2);
        assertArrayEquals(expectedStudents.toArray(), actualStudents.toArray());
    }

    @Test
    public void findByYear() {
        List<Student> expectedStudents = StudentsInit.defaultInitStudent();
        StudentServiceImpl studentServiceImpl = StudentServiceImpl.getInstance();
        List<Student> actualStudents=studentServiceImpl.findByYear(1998,expectedStudents);
        expectedStudents.remove(1);
        assertArrayEquals(expectedStudents.toArray(), actualStudents.toArray());
    }

    @Test
    public void findByGroup() {
        List<Student> expectedStudents = StudentsInit.defaultInitStudent();
        StudentServiceImpl studentServiceImpl = StudentServiceImpl.getInstance();
        List<Student> actualStudents=studentServiceImpl.findByGroup("IP-64",expectedStudents);
        expectedStudents.remove(2);
        assertArrayEquals(expectedStudents.toArray(), actualStudents.toArray());
    }

    @Test
    public void findByFacultyAndCourse() {
        List<Student> expectedStudents = StudentsInit.defaultInitStudent();
        StudentServiceImpl studentServiceImpl = StudentServiceImpl.getInstance();
        List<Student> actualStudents=studentServiceImpl.findByFacultyAndCourse("FICT",4,expectedStudents);
        expectedStudents.remove(2);
        expectedStudents.remove(1);
        assertArrayEquals(expectedStudents.toArray(), actualStudents.toArray());
    }
}