package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindOccurrencesTest {

    @Test
    public void occuringAt() {
    FindOccurrences findOccurrences=new FindOccurrences();
    String inputString="She sells seashells by the seashore";
    String matcingString="se";
        Integer[] ExpectedArray={4,6,10,12,27,29};
        Integer[] ResultingArray=findOccurrences.OccuringAt(inputString,matcingString);

        assertArrayEquals("FindOccurrences is failing",ExpectedArray,ResultingArray);
    }
}