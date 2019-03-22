package com.stackroute.PE5;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMap {
    public Map<String ,Boolean> checkFrequency(String[] stringArray)
    {
        Map<String, Boolean> map= new HashMap<String, Boolean>();
        for (int i=0;i<stringArray.length;i++)
        {
            if(map.containsKey(stringArray[i]))
                map.put(stringArray[i],true);
            else
                map.put(stringArray[i],false);
        }
        return map;
    }
}
