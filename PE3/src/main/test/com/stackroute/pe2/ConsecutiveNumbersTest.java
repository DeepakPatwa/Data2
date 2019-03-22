package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {

    @Test
    public void TestisConsecutive() {
        ConsecutiveNumbers cn=new ConsecutiveNumbers();
        boolean res1=cn.isConsecutive(5,4);
        boolean res2=cn.isConsecutive(6,5);
        boolean res3=cn.isConsecutive(45,67);

        assertTrue("isConsecutive is failing",res1);
        assertTrue("isConsecutive is failing",res2);
        assertFalse("isConsecutive is failing",res3);
    }
}