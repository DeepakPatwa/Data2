package com.stackroute.pe4;

public class CountFrequency {

    public int countFrequency(String str, char ch)
    {
        String strChar=Character.toString(ch);
        int charcount = str.length() - str.replaceAll(strChar, "").length();
        return charcount;
    }
}
