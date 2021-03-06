package com.task.homework4.repository;

import com.task.homework4.domain.Department;
import com.task.homework4.domain.Student;
import com.task.homework4.helper.utillity.PasswordUtils;
import com.task.homework4.service.StudentServiceImpl;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StudentServiceImplTest {


    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentServiceImpl studentService;

    @After
    public void resetMock() {
        reset(studentRepository);
    }

    @Test
    public void shouldReturnRegisterStudent() {
        Student studentOldPassword = Student.builder().withPassword("1234").build();
        Student studentExpected = (Student) studentOldPassword.clone(PasswordUtils.generateSecurePassword(studentOldPassword.getPassword()));

        when(studentRepository.save(any(Student.class))).thenReturn(Optional.ofNullable(studentExpected));

        Optional<Student> studentActual = studentService.register(studentOldPassword);
        studentActual.ifPresent(student -> assertTrue(PasswordUtils.verifyUserPassword(studentOldPassword.getPassword(),studentActual.get().getPassword())));
        assertNotEquals("1234", studentActual.get().getPassword());
    }

    @Test
    public void shouldFindStudentById() {
        Student expected = Student.builder().withName("Vova").build();
        when(studentRepository.findById(1L)).thenReturn(Optional.ofNullable(expected));

        Optional<Student> actual = studentService.findById(1L);
        actual.ifPresent(student -> assertEquals(expected, student));

    }

    @Test
    public void shouldReturnDeleteStudent() {
        Student expected = Student.builder().build();
        when(studentRepository.deleteById(1L)).thenReturn(Optional.ofNullable(expected));

        Optional<Student> actual = studentService.deleteById(1L);
        actual.ifPresent(student -> assertEquals(expected, student));
    }

    @Test
    public void shouldFindStudentByDepartment() {
        Student students = Student.builder().withDepartment(new Department(1L, "kpi")).build();
        ArrayList<Student> expected = new ArrayList<>();
        expected.add(students);
        when(studentRepository.findByDepartment(1L)).thenReturn(expected);

        ArrayList<Student> actual = studentService.findByDepartment(1L);
        assertArrayEquals(expected.toArray(), actual.toArray());

    }
    @Test
    public void shouldReturnLoginStudent() {
        Student studentOldPasswordAndEmail = Student.builder().withEmail("qwerty@gmail.com").withPassword("1234").build();
        Student studentExpected = (Student) studentOldPasswordAndEmail.clone(PasswordUtils.generateSecurePassword(studentOldPasswordAndEmail.getPassword()));

        when(studentRepository.findByEmail(any(String.class))).thenReturn(Optional.ofNullable(studentExpected));

        Optional<Student> studentActual = studentService.login(studentOldPasswordAndEmail.getEmail(),studentOldPasswordAndEmail.getPassword());
        studentActual.ifPresent(student -> assertTrue(PasswordUtils.verifyUserPassword(studentOldPasswordAndEmail.getPassword(),studentActual.get().getPassword())));
        assertNotEquals("1234", studentActual.get().getPassword());
    }

    @Test
    public void shouldFindStudentByYear() {
        Student students = Student.builder().withBirthday(LocalDate.of(1999, 6, 11)).build();
        ArrayList<Student> expected = new ArrayList<>();
        expected.add(students);
        when(studentRepository.findByYear(1920)).thenReturn(expected);

        ArrayList<Student> actual = studentService.findByYear(1920);
        assertArrayEquals(expected.toArray(), actual.toArray());


    }

    @Test
    public void findByGroup() {
        Student students = Student.builder().withGroup("IP-64").build();
        ArrayList<Student> expected = new ArrayList<>();
        expected.add(students);
        when(studentRepository.findByGroup("IP-64")).thenReturn(expected);

        ArrayList<Student> actual = studentService.findByGroup("IP-64");
        assertArrayEquals(expected.toArray(), actual.toArray());


    }

    @Test
    public void shouldFindStudentByDepartmentAndCourse() {
        Student students = Student.builder().withDepartment(new Department(1L, "kpi")).withCourse(4).build();
        ArrayList<Student> expected = new ArrayList<>();
        expected.add(students);
        when(studentRepository.findByDepartmentAndCourse(1L, 4)).thenReturn(expected);

        ArrayList<Student> actual = studentService.findByDepartmentAndCourse(1L, 4);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

}