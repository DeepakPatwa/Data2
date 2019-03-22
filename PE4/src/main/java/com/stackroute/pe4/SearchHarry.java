package com.stackroute.pe4;

public class SearchHarry {

    public boolean isHarryHere(String name) {

        boolean checkharry = name.matches("(.*)harry(.*)");
        if (checkharry)
            return true;
        return false;
    }
}
