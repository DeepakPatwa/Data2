package com.stackroute.pe4;

import java.util.Arrays;

public class SortInAlphabeticalOrder {
    public String[] sortString(String inputString)
    {
        String[] strArray=inputString.split(" ");
        Arrays.sort(strArray);
        return strArray;
    }
}
