package com.stackroute.PE5;

import java.util.ArrayList;
import java.util.TreeSet;

public class Sort {
    public ArrayList<String> sortNames(String[] inputString)
    {
        TreeSet<String> set=new TreeSet<String>();
        for(int i=0;i<inputString.length;i++)
            set.add(inputString[i]);

        ArrayList<String> resultingArrayList=new ArrayList<>();
//        for(int i=0;i<set.size();i++)
//            resultingArrayList.add(set.)
        resultingArrayList.addAll(set);
        return resultingArrayList;
    }
}
