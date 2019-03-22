package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    @Test
    public void isInLimit() {
        StudentMarks sm = new StudentMarks();
        int marks1=30;
        int marks2=99;

        assertTrue("StudentMarks is failing ",sm.isInLimit(marks1));
        assertTrue("StudentMarks is failing ",sm.isInLimit(marks2));
    }

    @Test
    public void isInLimitFailure() {
        StudentMarks sm = new StudentMarks();
        int marks1=-2;
        int marks2=101;

        assertFalse("StudentMarks is failing ",sm.isInLimit(marks1));
        assertFalse("StudentMarks is failing ",sm.isInLimit(marks2));
    }
}