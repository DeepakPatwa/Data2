package com.stackroute.PE5;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void sortNames() {
        Sort sort= new Sort();
        String[] inputStringArray={"Harry", "Olive", "Alice", "Bluto", "Eugene"};
        ArrayList<String> expectedArrayList=new ArrayList<>();
        expectedArrayList.add("Alice");
        expectedArrayList.add("Bluto");
        expectedArrayList.add("Eugene");
        expectedArrayList.add("Harry");
        expectedArrayList.add("Olive");
        ArrayList<String> resultingArrayList=sort.sortNames(inputStringArray);

        assertArrayEquals("sort is failing", expectedArrayList.toArray(), resultingArrayList.toArray());
    }
}