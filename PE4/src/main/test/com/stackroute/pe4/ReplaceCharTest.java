package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharTest {

    @Test
    public void replaceChar() {
        ReplaceChar replacedString= new ReplaceChar();

        assertEquals("ReplaceChar is failing",replacedString.replaceChar("daily dry"),"faity fry");
        assertEquals("ReplaceChar is failing",replacedString.replaceChar("deepawali"),"feepawati");
    }
}