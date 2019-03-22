package com.stackroute.pe2;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String args[])
    {
        //NegativeArraySizeException
        int arrSize = -8;
        try {
            int[] myArray = new int[arrSize];

        } catch (NegativeArraySizeException ex) {
            System.out.println("Can't create array of negative size" + ex);
        }

        //ArrayIndexOutOfBoundsException
        int marks[] = {  40, 50, 60 };

        try
        {
            System.out.println(marks[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            //System.out.println("Wrong index number, please enter correct number. " + e);
            System.out.println(e);
        }

        //NullPointerException

        String str=null;

        try{
            if(str.equals("yo"))
                System.out.println("yo");
        }
        catch (NullPointerException ex)
        {
            //System.out.print("NullPointerException Caught " + ex);
            System.out.println(ex);
        }
    }
}
