package com.stackroute.PE5;

import java.util.HashMap;
import java.util.Map;

public class NumberOfCounts {
    public Map<String, Integer> calculateNumberOfCounts(String strInput) {
        String alphaOnly = strInput.replaceAll("[@*-_]+", " ");
        String[] alphaOnlyArray = alphaOnly.split(" ");
        Map<String, Integer> hm =
                new HashMap<String, Integer>();
        for (int i = 0; i < alphaOnlyArray.length; i++) {
            if (hm.get(alphaOnlyArray[i]) == null) {
                hm.put(alphaOnlyArray[i], 1);
            } else
                hm.put(alphaOnlyArray[i], hm.get(alphaOnlyArray[i]) + 1);
        }
        return hm;
    }
}
