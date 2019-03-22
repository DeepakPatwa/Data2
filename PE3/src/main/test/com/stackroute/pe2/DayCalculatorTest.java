package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayCalculatorTest {

    @Test
    public void calCalendar() {
        DayCalculator dc= new DayCalculator();
        String [] ExpectedStr={"Mon 24/12/2018","Sun 30/12/2018"};

        assertArrayEquals("DayCalculator is failing ",dc.calCalendar(),ExpectedStr);
    }
}