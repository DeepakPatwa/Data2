package com.stackroute.PE5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class PlayWithMapTest {

    @Test
    public void mapPlay() {
        PlayWithMap playWithMap = new PlayWithMap();
        Map<String, String> inputMap=new HashMap<>();
        inputMap.put("val1","java");
        inputMap.put("val2","c++");
        Map<String, String> expectedMap=new HashMap<>();
        expectedMap.put("val1", " ");
        expectedMap.put("val2", "java");
        Map<String, String> resultingMap=playWithMap.mapPlay(inputMap);

        assertTrue(expectedMap.equals(resultingMap));
    }
}