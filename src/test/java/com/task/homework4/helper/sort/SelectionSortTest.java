package com.task.homework4.helper.sort;

import com.task.homework4.domain.Student;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {

    @Test
    public void shouldReturnSortArrayList() {
        Student student1 = Student.builder().
                withName("vova").
                withSurname("ivanov").
                withBirthday(LocalDate.of(1999,6,11)).build();
        Student student2 = Student.builder().
                withName("vania").
                withSurname("ivanov").
                withBirthday(LocalDate.of(1999,1,13)).build();
        Student student3 = Student.builder().
                withName("anton").
                withSurname("aaaa").
                withBirthday(LocalDate.of(1999,6,11)).build();


        ArrayList studentsExpected = new ArrayList();
        studentsExpected.add(student3);
        studentsExpected.add(student2);
        studentsExpected.add(student1);

        ArrayList studentsActual = new ArrayList();
        studentsActual.add(student1);
        studentsActual.add(student2);
        studentsActual.add(student3);
        SelectionSort.sort(studentsActual);

        assertArrayEquals(studentsExpected.toArray(), studentsActual.toArray());
    }
}