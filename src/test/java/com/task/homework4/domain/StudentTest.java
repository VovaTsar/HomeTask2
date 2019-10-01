package com.task.homework4.domain;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void shouldReturnCopyObject(){
        Student studentWithNewPassword = Student.builder()
                .withId(1L)
                .withName("Petro")
                .withSurname("Petrenko")
                .withBirthday(LocalDate.of(1999, 11, 13))
                .withGroup("IP-64")
                .withPassword("54321")
                .withAddress(new Address("Kyiv", "WWW", 8))
                .withPhoneNumber("38063355345")
                .withDepartment(new Department(7L,"kpi"))
                .withEmail("petro@gmail.com")
                .withCourse(4)
                .build();

        Student studentForCopy = Student.builder()
                .withId(1L)
                .withName("Petro")
                .withSurname("Petrenko")
                .withBirthday(LocalDate.of(1999, 11, 13))
                .withGroup("IP-64")
                .withPassword("12345")
                .withAddress(new Address("Kyiv", "WWW", 8))
                .withPhoneNumber("38063355345")
                .withDepartment(new Department(7L,"kpi"))
                .withEmail("petro@gmail.com")
                .withCourse(4)
                .build();
        Student studentActual = (Student) studentForCopy.clone("54321");

        assertEquals(studentWithNewPassword,studentActual);


    }

}