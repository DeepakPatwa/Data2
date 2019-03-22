package com.stackroute.PE5;

import javax.print.DocFlavor;

public class UpdateArray {
    public String[] replaceArrayElement(String[] arrayString, String element, String replaceingString)
    {
        for(int i=0;i<arrayString.length;i++)
        {
            if (arrayString[i].equals(element))
            {
                arrayString[i]=replaceingString;
                break;
            }
        }
        return arrayString;
    }

    public String[] clearArray(String[] StringArray)
    {
        StringArray=null;
        return StringArray;
    }
}
