package com.task2.homework7.console.sort;

import com.task2.homework7.console.entity.User;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {

    @Test
    public void shouldReturnSortArrayList() {
        User vova = new User("vova", "surname", 20, "first@gmail.com");
        User vania = new User("vania", "surname", 20, "second@gmail.com");
        User vova1 = new User("vova", "surname", 15, "third@gmail.com");

        ArrayList studentsExpected = new ArrayList();
        studentsExpected.add(vania);
        studentsExpected.add(vova1);
        studentsExpected.add(vova);

        ArrayList studentsActual = new ArrayList();
        studentsActual.add(vova);
        studentsActual.add(vania);
        studentsActual.add(vova1);
        SelectionSort.sort(studentsActual);

        assertArrayEquals(studentsExpected.toArray(), studentsActual.toArray());

    }
}