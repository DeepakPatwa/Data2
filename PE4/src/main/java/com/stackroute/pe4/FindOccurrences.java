package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindOccurrences {
    public Integer[] OccuringAt(String inputString, String matchingString)
    {
        List<Integer> list = new ArrayList<Integer>();
        Pattern pattern= Pattern.compile(matchingString);
        Matcher m=pattern.matcher(inputString);
        while(m.find())
        {
            list.add(m.start());
            list.add(m.end());
        }
        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);
        return arr;
    }
}
