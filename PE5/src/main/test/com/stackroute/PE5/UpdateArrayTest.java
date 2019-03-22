package com.stackroute.PE5;

import org.junit.Test;

import static org.junit.Assert.*;

public class UpdateArrayTest {

    @Test
    public void replaceArrayElement() {
        UpdateArray updateArray = new UpdateArray();
        String[] arrayString={"Apple", "Grape", "Melon", "Berry"};
        String element="Apple";
        String replaceingString="Kiwi";
        String[] expectedArray={"Kiwi", "Grape", "Melon", "Berry"};
        String[] ResultingArray=updateArray.replaceArrayElement(arrayString,element,replaceingString);
        assertArrayEquals("UpdateArray is failing",expectedArray,ResultingArray);
    }

    @Test
    public void clearArray() {
        UpdateArray updateArray = new UpdateArray();
        String[] inputArray={"Apple", "Grape", "Melon", "Berry"};
        String[] resultingArray=updateArray.clearArray(inputArray);
        String[] expectedArray=null;

        assertArrayEquals("clearArray is failing",expectedArray,resultingArray);
    }
}