package com.stackroute.pe2;

import java.util.Scanner;

public class ConsecutiveNumbers {

    public static boolean isConsecutive(int a, int b)
    {
        if(a==b+1)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();

        String[] strArr=str.split(",");
        int prevNum=Integer.parseInt(strArr[0].trim());
        for(int i=1;i<strArr.length;i++)
        {
            int nextNum= Integer.parseInt(strArr[i].trim());
            if(isConsecutive(prevNum,nextNum)==false)
            {
                System.out.print(str + " are non consecutive numbers");
                return;
            }
            prevNum=nextNum;
        }
        System.out.println(str + " are consecutive numbers");
    }
}
