package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountFrequencyTest {
    @Test
    public void TestCountFrequency()
    {
        CountFrequency countFrequency=new CountFrequency();

        assertEquals("CountFrequency is failing",countFrequency.countFrequency("deepakpatwa",'a'),3);
        assertEquals("CountFrequency is failing",countFrequency.countFrequency("deepakpatwa",'z'),0);
    }
}