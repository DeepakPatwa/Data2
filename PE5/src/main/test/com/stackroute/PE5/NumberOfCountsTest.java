package com.stackroute.PE5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class NumberOfCountsTest {

    @Test
    public void calculateNumberOfCounts() {
        NumberOfCounts numberOfCounts = new NumberOfCounts();
        String inputString="one one -one___two,,three,one @three*one?two";
        Map<String, Integer> expectedMap=new HashMap<String, Integer>();
        expectedMap.put("one",5);
        expectedMap.put("two",2);
        expectedMap.put("three",2);
        Map<String, Integer> resultingMap = numberOfCounts.calculateNumberOfCounts(inputString);
        resultingMap.remove("");
        assertTrue(expectedMap.equals(resultingMap));
    }
}