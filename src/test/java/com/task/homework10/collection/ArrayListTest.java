package com.task.homework10.collection;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static java.util.Optional.*;
import static org.junit.Assert.*;

public class ArrayListTest {
    ArrayList<Integer> tests;

    @Before
    public void initMyArrayList() {
        tests = new ArrayList<>();
        tests.add(3);
        tests.add(2);
        tests.add(7);
    }

    @Test
    public void shouldReturnSizeOfList() {
        assertEquals(3, tests.size());
        tests.add(4);
        assertEquals(4, tests.size());
    }

    @Test
    public void shouldReturnTrueForEmptyList() {
        assertFalse(tests.isEmpty());
        tests.clean();
        assertTrue(tests.isEmpty());
    }

    @Test
    public void shouldAddLastItemToList() {
        tests.add(5);
        assertEquals(of(5), ofNullable(tests.getByIndex(3)));
        assertEquals(4, tests.size());
    }

    @Test
    public void shouldAddItemToListByIndex() {
        tests.add(1, 7);
        assertEquals(of(7), ofNullable(tests.getByIndex(1)));
        assertEquals(4, tests.size());
    }

    @Test
    public void shouldChangeItemInListByIndex() {
        tests.set(0, 7);
        assertEquals(of(7), ofNullable(tests.getByIndex(0)));
        assertEquals(3, tests.size());
    }

    @Test
    public void shouldReturnItemInListByIndex() {
        assertEquals(of(3), ofNullable(tests.getByIndex(0)));
        assertEquals(3, tests.size());
    }

    @Test
    public void shouldRemoveElementByIndex() {
        tests.remove(1);
        assertEquals(of(7),ofNullable(tests.getByIndex(1)));
        assertEquals(2, tests.size());
    }


    @Test
    public void shouldCleanList() {
        tests.clean();
        assertTrue(tests.isEmpty());
    }

    @Test
    public void shouldReturnCorrectIterator() {
        Iterator<Integer> iterator = tests.iterator();
        iterator.next();
        while(iterator.hasNext())
        {
            iterator.remove();
        }
        assertEquals(tests.size(),1);
    }
}