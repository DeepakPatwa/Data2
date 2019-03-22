package com.stackroute.pe2;

import java.util.Scanner;

public class StudentMarks {
    public static boolean isInLimit(int marks)
    {
        if(marks>=0 && marks<=100) return true;
        else
            return false;
    }
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numOfStudents= in.nextInt();

        int[] stuGrades= new int[numOfStudents];

        for (int i=0;i<numOfStudents;i++) {
            int tempMarks=in.nextInt();
            if(isInLimit(tempMarks)==false)
            {
                System.out.println("Please Enter correct marks(it should be withing 0 to 100)");
                tempMarks=in.nextInt();
            }
            stuGrades[i] = tempMarks;
        }

        System.out.println("All students marks are: ");
        for(int i=0;i<numOfStudents;i++) System.out.println("Student " + i + ": " +stuGrades[i]);
    }
}
