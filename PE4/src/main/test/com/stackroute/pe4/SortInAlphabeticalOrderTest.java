package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortInAlphabeticalOrderTest {

    @Test
    public void sortString() {
        SortInAlphabeticalOrder sortInAlphabeticalOrder=new SortInAlphabeticalOrder();

        String inputString="abc bcd bac";
        String[] ExpectedStringArray={"abc","bac","bcd"};
        String[] ResltingArray=sortInAlphabeticalOrder.sortString(inputString);

        assertArrayEquals("sortString is failing",ResltingArray,ExpectedStringArray);
    }
}