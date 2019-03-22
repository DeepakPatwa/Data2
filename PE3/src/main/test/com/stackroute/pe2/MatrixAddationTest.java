package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAddationTest {

    @Test
    public void addMatrix() {
        MatrixAddation ma = new MatrixAddation();
        int[][] mat1= {{1,2},{3,4},{5,6}};
        int[][] mat2= {{9,8},{7,6},{5,4}};
        int[][] ExpmatSum= {{10,10},{10,10},{10,10}};
        int[][] matSum=ma.AddMatrix(mat1,mat2,3,2);

        assertArrayEquals("MartrixAddation is failing ",matSum,ExpmatSum);
    }
}