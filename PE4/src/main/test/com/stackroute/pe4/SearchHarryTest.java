package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchHarryTest {

    @Test
    public void isHarryHere() {
        SearchHarry searchHarry=new SearchHarry();
        assertTrue("SearchHarry is failing",searchHarry.isHarryHere("hy harry"));
        assertTrue("SearchHarry is failing",searchHarry.isHarryHere("harry"));
        assertTrue("SearchHarry is failing",searchHarry.isHarryHere("I am harry"));
    }
    @Test
    public void isHarryHereFailure() {
        SearchHarry searchHarry=new SearchHarry();
        assertFalse("SearchHarry is failing",searchHarry.isHarryHere("hy Harry"));
        assertFalse("SearchHarry is failing",searchHarry.isHarryHere("rry"));

    }
}