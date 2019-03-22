package com.stackroute.pe2;

import java.util.Scanner;

class Matrix{
    int rows;
    int colomns;
    public void PrintMatrix(int rows, int colomns, int[][] matrixSum)
    {
        // printing the matrixSum
        for(int i=0;i<rows;i++,System.out.println())
            for(int j=0;j<colomns;j++)
                System.out.print(matrixSum[i][j]+"\t");
    }
}

public class MatrixAddation extends Matrix{

    public static int[][] AddMatrix(int[][] mat1, int[][] mat2,int rows,int colomns){

        int[][] matrixSum = new int[rows][colomns];
        // adding both of tthe matrix to matrixSum
        for(int i=0;i<rows;i++)
            for(int j=0;j<colomns;j++)
                matrixSum[i][j]=mat1[i][j]+mat2[i][j];
        return matrixSum;
    }

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of rows and colomns");

        MatrixAddation ma = new MatrixAddation();
        ma.rows=in.nextInt();
        ma.colomns=in.nextInt();
        //AddMatrix(rows, colomns);
        int[][] matrix1 = new int[ma.rows][ma.colomns];;//matrix 1
        int[][] matrix2 = new int[ma.rows][ma.colomns];//matrix2
        int[][] matrixSum = new int[ma.rows][ma.colomns];//sum of matrix1 and matrix2

        //entering values in first matrix
        for(int i=0;i<ma.rows;i++)
            for(int j=0;j<ma.colomns;j++)
                matrix1[i][j]=in.nextInt();

         //entering values in second matrix
        for(int i=0;i<ma.rows;i++)
            for(int j=0;j<ma.colomns;j++)
                matrix2[i][j]=in.nextInt();

//         // adding both of tthe matrix to matrixSum
//        for(int i=0;i<ma.rows;i++)
//            for(int j=0;j<ma.colomns;j++)
//                matrixSum[i][j]=matrix1[i][j] + matrix2[i][j];
        matrixSum=AddMatrix(matrix1,matrix2,ma.rows,ma.colomns);

        ma.PrintMatrix(ma.rows, ma.colomns, matrixSum);
    }
}
