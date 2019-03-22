package com.stackroute.pe2;

import java.util.Scanner;

public class RemoveVowels {

    public static String RemoveFromString(String City)
    {
        return City.replaceAll("[aeiou]", "");
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String City=in.nextLine();
        String resCity;


        //resCity = City.replaceAll("[aeiou]", "");
        System.out.println(RemoveFromString(City));
    }
}
