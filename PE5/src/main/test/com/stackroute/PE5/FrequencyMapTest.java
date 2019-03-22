package com.stackroute.PE5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FrequencyMapTest {

    @Test
    public void checkFrequency() {
        FrequencyMap frequencyMap = new FrequencyMap();
        String[] inputArray = {"a","b","c","d","a","c","c"};
        Map<String, Boolean> expectedMap= new HashMap<String, Boolean>();
        expectedMap.put("a",true);
        expectedMap.put("b",false);
        expectedMap.put("c",true);
        expectedMap.put("d",false);
        Map<String, Boolean> resultingMap= frequencyMap.checkFrequency(inputArray);

        assertTrue("checkFrequency is failing", expectedMap.equals(resultingMap));
    }
}