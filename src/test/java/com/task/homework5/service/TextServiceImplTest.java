package com.task.homework5.service;

import com.task.homework5.domain.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextServiceImplTest {
    private final TextServiceImpl textService = new TextServiceImpl();

    @Test
    public void shouldReturnNullStringForNullText() {
        String expectedResult = null;
        String actualResult = textService.convertTextToString(null);
        assertNull("", actualResult);
    }


    @Test
    public void shouldReturnTextFromString() {
        String expectedResult = "Hello Hello4."+"\n"+ "Hello Hello4.Hello2.Hello5.";
        Text text = new TextServiceImpl().convertStringToText("Hello Hello4.Hello2.Hello5.");
        String actualResult = text.toString();
        assertEquals(expectedResult, actualResult);
    }
}