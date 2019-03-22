package com.stackroute.pe4;

public class TransposeOfAParagraph {
    public String Transpose(String str)
    {
        StringBuilder ReversedString = new StringBuilder();
        ReversedString.append(str);
        ReversedString=ReversedString.reverse();

        String revStr=ReversedString.toString();

        String[] revStrArray=revStr.split(" ");

        String TransposedString="";
        for(int i=revStrArray.length-1;i>=0;i--)
        {
            TransposedString=TransposedString+revStrArray[i]+" ";
        }
        return TransposedString.trim();

    }
}
