package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
@Test
    public void TestRemoveVowels(){
        RemoveVowels rv = new RemoveVowels();
        String resStr=rv.RemoveFromString("India");
        String resStr1=rv.RemoveFromString("Ukrain");
        assertEquals("RemoveFromString is failing","Ind", resStr);
        assertEquals("RemoveFromString is Failing","Ukrn",resStr1);
    }
}